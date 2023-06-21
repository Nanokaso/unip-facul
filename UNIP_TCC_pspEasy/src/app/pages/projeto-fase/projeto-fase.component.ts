import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { DialogService } from '../../widgets/dialog/dialog.service';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService, UtilsService } from '../../services';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-projeto-fase',
  templateUrl: './projeto-fase.component.html',
  styleUrls: ['./projeto-fase.component.less']
})
export class ProjetoFaseComponent implements OnInit, OnDestroy {

  validator_msg: string[] = [];

  private sub: any;
  private subParams: any;
  variavelProjetos: any[];
  indexProjeto: number = -1;
  indexFase: number = -1;
  obj: ProjetoModel;

  FaseVisualizando: any;

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private formBuilder: FormBuilder,
    private projetoService: ProjetoService,
    private utilsService: UtilsService,
    private dialogService: DialogService,
  ) { }

  ngOnDestroy() {
    console.log("Matou");
    this.sub.unsubscribe();
    this.subParams.unsubscribe();
  }

  ngOnInit(): void {

    this.subParams = this.activatedRoute.paramMap.subscribe(

      params => {
        let proje: string | null = params.get('id');
        let fase: string | null = params.get('id1');
        if (proje && fase)
          this.carregarProjeto(proje, fase);
        else {
          this.router.navigate(['/home']);
        }
      }

    );

  }

  carregarProjeto(id: string, fase: string) {

    this.indexProjeto = Number(id);
    this.indexFase = Number(fase);

    // console.log(this.indexProjeto);
    // console.log(this.indexFase);

    // alimentando variavel de projeto
    this.projetoService.carregarLocalStorage();
    if (this.projetoService.isProjetosCarregado()) {
      this.sub = this.projetoService.getProjetos().subscribe(
        (result) => {

          this.variavelProjetos = result;

          // -> tenta popular o objeto global desse componente com o item na index do array, caso de erro, retorna para home
          try {
            this.obj = this.variavelProjetos[this.indexProjeto];

            // não compensa salvar no localstorage os resumo e informações 
            this.obj = this.projetoService.carregarDetalheFases(this.obj);

            try {


              console.log("Index-> ", this.indexFase);
              if (this.indexFase >= this.obj.Fases.length) {
                this.indexFase = this.obj.Fases.length - 1;
              }

              if (this.indexFase < 0) {
                this.indexFase = 0;
              }

              const element = this.obj.Fases[this.indexFase];

              let elemento = {
                el: element,
                Nome: element.Nome,
                Status: element.Status,
                Resumo: element.Resumo,
                Index: this.indexFase,
                Cor: this.utilsService.carregarCor(element.Status),
                Avanco: this.utilsService.descobrirAvanco(this.obj, element)
              }
              this.FaseVisualizando = elemento;              

            } catch(er) {
              console.error(er);
              this.router.navigate(['/projeto-home', this.indexProjeto]);
            }

          } catch(er) {
            console.error(er);
            this.router.navigate(['/home']);
          }

          // por questoes do alem ..  o unsubscribe não funciona no ngdestroy
          try {
            this.sub.unsubscribe();
          } catch{}
          

        }
      );

    }

  }

  voltarFases() {
    this.router.navigate(['/projeto-home', this.indexProjeto]);
  }

  anterior() {

    this.carregarProjeto(this.indexProjeto.toString(), (this.indexFase - 1).toString())
    // this.router.navigate(['/projeto-fase', this.indexProjeto, this.indexFase - 1]);
  }
  proximo() {

    console.log("proximo");

    try {
      this.variavelProjetos[this.indexProjeto].Fases[this.indexFase].flgConcluido = true;
      this.projetoService.setProjetos(this.variavelProjetos);
    } catch { }

    this.carregarProjeto(this.indexProjeto.toString(), (this.indexFase + 1).toString())
    // this.router.navigate(['/projeto-fase', this.indexProjeto, this.indexFase + 1]);
  }

  escreverAnotacao() {
    this.dialogService.openAnotacao({ indexProjeto: this.indexProjeto, indexFase: this.indexFase });
  }
}
