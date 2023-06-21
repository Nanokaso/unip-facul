import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { DialogService } from '../../widgets/dialog/dialog.service';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService } from '../../services';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-projeto-editar',
  templateUrl: './projeto-editar.component.html',
  styleUrls: ['./projeto-editar.component.less']
})
export class ProjetoEditarComponent implements OnInit, OnDestroy {

  validator_msg: string[] = [];
  loadingForm: boolean = false;
  formObjeto: FormGroup;

  private sub: any;
  private subParam: any;
  variavelProjetos: any[];
  indexProjeto: number = -1;

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private formBuilder: FormBuilder,
    private projetoService: ProjetoService,
    private dialogService: DialogService,
  ) { }

  ngOnDestroy() {
    this.sub.unsubscribe();
    this.subParam.unsubscribe();
  }

  ngOnInit(): void {


    // -> iniciando form 
    this.formObjeto = new FormGroup({
      nome: new FormControl('', [Validators.required]),
      descricao: new FormControl('', [Validators.required])
    });

    // -> subscribe para pegar o parametro da rota 
    this.subParam = this.activatedRoute.paramMap.subscribe(

      params => {
        let parametro: string | null = params.get('id');
        if (parametro)
          this.carregarProjeto(parametro);
        else {
          this.router.navigate(['/home']);
        }
      }

    );

  }

  carregarProjeto(id: string) {

    this.indexProjeto = Number(id);

    // alimentando variavel de projeto
    this.projetoService.carregarLocalStorage();
    if (this.projetoService.isProjetosCarregado()) {
      this.sub = this.projetoService.getProjetos().subscribe(
        (result) => {

          this.variavelProjetos = result;

          let item: ProjetoModel = this.variavelProjetos[this.indexProjeto];

          // -> populando os elementos do form 
          this.formObjeto.patchValue({ nome: item.Nome });
          this.formObjeto.patchValue({ descricao: item.Descricao });

        }
      );
    }

  }

  atualizar() {

    // -> validação
    this.validator_msg = [];

    if (this.formObjeto.get('nome')!.status.toLowerCase() === 'invalid')
      this.validator_msg.push('Nome é obrigatório');

    if (this.formObjeto.get('descricao')!.status.toLowerCase() === 'invalid')
      this.validator_msg.push('Descrição é obrigatória');

    if (this.formObjeto.valid) {

      // -> atualizando a variavel global
      this.variavelProjetos[this.indexProjeto].Nome = this.formObjeto.controls.nome.value.trim();
      this.variavelProjetos[this.indexProjeto].Descricao = this.formObjeto.controls.descricao.value.trim();

      this.projetoService.setProjetos(this.variavelProjetos);

      this.dialogService.open({ message: ['Editado com sucesso!'] });
      this.dialogService.confirmed().subscribe(afterClosed => { this.router.navigate(['/projeto-home', this.indexProjeto]); });

    }

    if (this.validator_msg.length > 0)
      this.dialogService.open({ message: this.validator_msg });


  }

  apagarProjeto() {

    this.variavelProjetos.splice(this.indexProjeto, 1);
    this.projetoService.setProjetos(this.variavelProjetos);
    this.dialogService.open({ message: ['Apagado com sucesso!'] });
    this.dialogService.confirmed().subscribe(afterClosed => { this.router.navigate(['/home']); });


  }

}
