import { Component, OnInit, OnDestroy } from '@angular/core';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService } from '../../services';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { DialogService } from '../../widgets/dialog/dialog.service';

@Component({
  selector: 'app-projeto-cadastrar',
  templateUrl: './projeto-cadastrar.component.html',
  styleUrls: ['./projeto-cadastrar.component.less']
})
export class ProjetoCadastrarComponent implements OnInit, OnDestroy {

  validator_msg: string[] = [];
  loadingForm: boolean = false;
  formObjeto: FormGroup;

  private sub: any;
  variavelProjetos: any[];

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private projetoService: ProjetoService,
    private dialogService: DialogService,
  ) { }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  ngOnInit(): void {

    this.formObjeto = new FormGroup({

      nome: new FormControl('', [Validators.required]),
      descricao: new FormControl('', [Validators.required])

    });

    // alimentando variavel de projeto
    this.projetoService.carregarLocalStorage();
    if (this.projetoService.isProjetosCarregado()) {
      this.sub = this.projetoService.getProjetos().subscribe(
        (result) => {
          this.variavelProjetos = result;
        }
      );
    }

  }

  cadastrar(): void {

    // -> validação
    this.validator_msg = [];

    if (this.formObjeto.get('nome')!.status.toLowerCase() === 'invalid')
      this.validator_msg.push('Nome é obrigatório');

    if (this.formObjeto.get('descricao')!.status.toLowerCase() === 'invalid')
      this.validator_msg.push('Descrição é obrigatória');

    if (this.formObjeto.valid) {

      let nome = this.formObjeto.controls.nome.value.trim();
      let descricao = this.formObjeto.controls.descricao.value.trim();

      try {

        // se no localstorage nao tem algo 
        if (!this.projetoService.carregarLocalStorage()) {

          let proje: ProjetoModel = this.projetoService.montarNovoProjeto(nome, descricao);
          let arr: Array<ProjetoModel> = new Array<ProjetoModel>();
          arr.push(proje);
          this.projetoService.setProjetos(arr);

        }
        else {

          let proje: ProjetoModel = this.projetoService.montarNovoProjeto(nome, descricao);
          this.variavelProjetos.push(proje)
          this.projetoService.setProjetos(this.variavelProjetos);

        }

        this.dialogService.open({ message: ['Cadastrado com sucesso!'] });
        this.dialogService.confirmed().subscribe(afterClosed => { this.router.navigate(['/home']); });


      } catch (error) {
        this.validator_msg.push('Não foi possível criar um projeto :T.');
        this.validator_msg.push('Mais detalhes -> ' + error);
        this.dialogService.open({ message: this.validator_msg });
      }
    }

    if (this.validator_msg.length > 0)
      this.dialogService.open({ message: this.validator_msg });



  }
}
