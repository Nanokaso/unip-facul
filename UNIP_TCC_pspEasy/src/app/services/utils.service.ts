import { Injectable } from '@angular/core';
import { ProjetoItemModel, ProjetoModel } from '../models';
import { ProjetoService, CustomStorageService } from '../services';

@Injectable({
  providedIn: 'root'
})
export class UtilsService {

  constructor(
    private projetoService: ProjetoService,
    private customStorageService: CustomStorageService) { }

  public descobrirAvanco(projeto: ProjetoModel, fase: ProjetoItemModel): number {
    let ret: number = 0;
    try {
      var contadorFaseEtapas = 0;
      var contadorFaseEtapasFeitas = 0;
      for (let i = 0; i < projeto.Fases.length; i++) {
        const element = projeto.Fases[i];

        if (element.Status == fase.Status) {
          contadorFaseEtapas++;

          if (element.flgConcluido) {
            contadorFaseEtapasFeitas++;
          }
        }

        try {
          ret = Math.round((contadorFaseEtapasFeitas * 100) / contadorFaseEtapas);
        } catch { }

      }

    } catch { }
    return ret;
  }

  itens: any = []
  public carregarCor(etapa: string): string {

    this.itens = [];

    for (let i = 0; i < this.projetoService.listaPsp.length; i++) {

      const element = this.projetoService.listaPsp[i];
      if (this.itens.indexOf(element.Etapa) == -1)
        this.itens.push(element.Etapa);

    }

    let ret: string = "corpadrao-1";
    for (let i = 0; i < this.itens.length; i++) {
      const element = this.itens[i];

      if (element == etapa)
        ret = "corpadrao-" + (i + 1).toString();

    }

    return ret;
  }

  public isPrimeiroAcesso(): boolean {
    let ret: boolean = true;

    var possivel = this.customStorageService.get("naoprimneiroacesso");
    if (possivel && possivel == "true")
      ret = false;
    return ret;
  }

  public registrarPrimeiroAcesso() {
    this.customStorageService.set("naoprimneiroacesso", "true");
  }

}
