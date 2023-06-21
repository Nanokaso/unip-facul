import { ChangeDetectionStrategy, Component, HostListener, Inject, Output } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { ProjetoService, UtilsService } from '../../../services';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-anotacao-fase',
  templateUrl: './anotacao-fase.component.html',
  styleUrls: ['./anotacao-fase.component.less']
})
export class AnotacaoFaseComponent {

  indexProjeto: number;
  indexFase: number;
  anotacao: string;

  private sub: any;
  variavelProjetos: any[];
  formObjeto: FormGroup;

  constructor(
    @Inject(MAT_DIALOG_DATA) public data: { indexProjeto: number, indexFase: number },
    private mdDialogRef: MatDialogRef<AnotacaoFaseComponent>,
    private projetoService: ProjetoService,
  ) {
    this.indexProjeto = data.indexProjeto;
    this.indexFase = data.indexFase;

    this.formObjeto = new FormGroup({
      anotacao: new FormControl('', [Validators.required]),
    });

    this.carregarAnotacao();
  }

  private carregarAnotacao() {

    this.sub = this.projetoService.getProjetos().subscribe(
      (result) => {
        this.variavelProjetos = result;
        this.formObjeto.patchValue({ anotacao: this.variavelProjetos[this.indexProjeto].Fases[this.indexFase].Anotacao });
      }
    );
  }

  public save() {

    try {
      this.variavelProjetos[this.indexProjeto].Fases[this.indexFase].Anotacao = this.formObjeto.controls.anotacao.value.trim(); ;
      this.projetoService.setProjetos(this.variavelProjetos);
    } catch { }
    this.sub.unsubscribe();
    this.mdDialogRef.close(true);
  }

  public close() {

    this.sub.unsubscribe();
    this.mdDialogRef.close(false);
  }

  @HostListener("keydown.esc")
  public onEsc() {
    this.close();
  }

}
