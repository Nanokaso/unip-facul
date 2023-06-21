import { Component, OnInit } from '@angular/core';
import { ProjetoItemModel, ProjetoModel } from '../../models';
import { ProjetoService, UtilsService, } from '../../services';

@Component({
  selector: 'app-favoritos',
  templateUrl: './favoritos.component.html',
  styleUrls: ['./favoritos.component.less']
})
export class FavoritosComponent implements OnInit {

  variavelProjetos: any[];
  listaFavoritos: any = [];

  private sub: any;

  constructor(
    private projetoService: ProjetoService,
    private utilsService: UtilsService
    ) { }

  ngOnInit(): void {

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

          });

          try{
            this.sub.unsubscribe();
          } catch{}

        }
      );
    }

  }


}
