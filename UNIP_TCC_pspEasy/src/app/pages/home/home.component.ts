import { Component, OnInit, OnDestroy } from '@angular/core';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService, UtilsService } from '../../services';
import { BehaviorSubject, Observable, of } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.less']
})
export class HomeComponent implements OnInit, OnDestroy {

  variavelProjetos: any[];
  listaTodos: any = [];
  listaFavoritos: any;

  private sub: any;

  constructor(private projetoService: ProjetoService, private utilsService: UtilsService) { }

  ngOnInit(): void {

    this.utilsService.registrarPrimeiroAcesso();

    this.projetoService.carregarLocalStorage();
    this.carregarListagens();

  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  public carregarListagens() {

    this.projetoService.carregarLocalStorage();

    if (this.projetoService.isProjetosCarregado()) {
      this.sub = this.projetoService.getProjetos().subscribe(
        (result) => {

          this.listaTodos = [];
          this.listaFavoritos = [];

          this.variavelProjetos = result;

          console.log("Projetos Armazenados na memoria -> ", result);

          result.forEach(element => {

            let faseAtual: any;

            // procura a ultima fase que não foi concluida
            for (let i = element.Fases.length - 1; i >= 0; i--) {
              const fase = element.Fases[i];
              if (!fase.flgConcluido)
                faseAtual = fase;
            }

            // caso não encontrou, então tudo foi concluido
            if (!faseAtual) {
              faseAtual = element.Fases[element.Fases.length - 1];
            }


            let elemento = {
              Projeto: element,
              Fase: faseAtual,
              Cor: this.utilsService.carregarCor(faseAtual.Status),
              Avanco: this.utilsService.descobrirAvanco(element, faseAtual)
            }

            if (element.Favorito)
              this.listaFavoritos.push(elemento);
            else
              this.listaTodos.push(elemento);

          });


        }
      );
    }

  }

  public debugCriarProjeto() {

    // se no localstorage nao tem algo 
    if (!this.projetoService.carregarLocalStorage()) {

      let proje: ProjetoModel = this.projetoService.montarNovoProjeto("P " + Math.random().toString(36).substr(2, 9), "exemplo");
      let arr: Array<ProjetoModel> = new Array<ProjetoModel>();
      arr.push(proje);

      console.log("arr -> ", arr);
      this.projetoService.setProjetos(arr);

    }
    else {

      let proje: ProjetoModel = this.projetoService.montarNovoProjeto("P " + Math.random().toString(36).substr(2, 9), "exemplo");
      this.variavelProjetos.push(proje)

      console.log("this.variavelProjetos -> ", this.variavelProjetos);
      this.projetoService.setProjetos(this.variavelProjetos);

    }

    // this.carregarListagens();
  }

}
