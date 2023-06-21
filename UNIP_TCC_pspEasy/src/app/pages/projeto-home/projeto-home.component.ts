import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { DialogService } from '../../widgets/dialog/dialog.service';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService, UtilsService } from '../../services';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-projeto-home',
  templateUrl: './projeto-home.component.html',
  styleUrls: ['./projeto-home.component.less']
})
export class ProjetoHomeComponent implements OnInit, OnDestroy {

  validator_msg: string[] = [];

  private sub: any;
  private subParam: any;
  variavelProjetos: any[];
  indexProjeto: number = -1;
  obj: ProjetoModel;

  listaFasesAtuais: any = [];
  listaFasesProximas: any = [];
  listaFasesFeitas: any = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private formBuilder: FormBuilder,
    private projetoService: ProjetoService,
    private utilsService: UtilsService,
    private dialogService: DialogService,
  ) { }

  ngOnDestroy() {
    this.sub.unsubscribe();
    this.subParam.unsubscribe();
  }

  ngOnInit(): void {

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

          // -> tenta popular o objeto global desse componente com o item na index do array, caso de erro, retorna para home
          try {
            this.obj = this.variavelProjetos[this.indexProjeto];

            try {

              this.listaFasesAtuais = [];
              this.listaFasesFeitas = [];
              this.listaFasesProximas = [];

              let faseAtual: any = null;

              let faseProxima: any = null;

              for (let i = 0; i < this.obj.Fases.length; i++) {
                const element = this.obj.Fases[i];

                let elemento = {
                  Nome: element.Nome,
                  Status: element.Status,
                  Index: i,
                  Cor: this.utilsService.carregarCor(element.Status),
                  Avanco: this.utilsService.descobrirAvanco(this.obj, element)
                }

                // -> tratando fase atual
                if (!element.flgConcluido && faseAtual == null)
                  faseAtual = elemento;

                // -> tratando proxima fase
                try {
                  if (i == faseAtual.Index + 1)
                    faseProxima = elemento;
                } catch (error) { }

                if (element.flgConcluido)
                  this.listaFasesFeitas.push(elemento);

              }

              if (faseAtual != null)
                this.listaFasesAtuais.push(faseAtual);

              if (faseProxima != null)
                this.listaFasesProximas.push(faseProxima);

              if (this.listaFasesFeitas.length > 0)
                this.listaFasesFeitas = this.listaFasesFeitas.reverse();

            } catch { }

          } catch {
            this.router.navigate(['/home']);
          }

          try {
            this.sub.unsubscribe();
          } catch { }

        }
      );
    }

  }

  resetar() {

    try {

      for (let i = 0; i < this.variavelProjetos[this.indexProjeto].Fases.length; i++) {
        this.variavelProjetos[this.indexProjeto].Fases[i].flgConcluido = false;
      }
      this.projetoService.setProjetos(this.variavelProjetos);

    } catch (e) { }

  }

  favoritar() {

    try {

      this.variavelProjetos[this.indexProjeto].Favorito = !this.variavelProjetos[this.indexProjeto].Favorito;
      this.projetoService.setProjetos(this.variavelProjetos);

    } catch (e) { }

  }

  irPara(index: string) {
    this.router.navigate(['/projeto-fase', this.indexProjeto, index]);
  }
}
