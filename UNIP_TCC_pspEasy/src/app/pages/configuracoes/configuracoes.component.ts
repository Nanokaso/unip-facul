import { Component, OnInit } from '@angular/core';
import { ProjetoService } from '../../services';
import { Router,  ActivatedRoute, ParamMap } from '@angular/router';
import { DialogService } from '../../widgets/dialog/dialog.service';

@Component({
  selector: 'app-configuracoes',
  templateUrl: './configuracoes.component.html',
  styleUrls: ['./configuracoes.component.less']
})
export class ConfiguracoesComponent implements OnInit {

  constructor(
    private projetoService: ProjetoService,
    private router: Router,
    private dialogService: DialogService
    ) { }

  ngOnInit(): void {
  }

  public excluirTodosProjetos(){

    this.projetoService.resetProjeto();

    this.dialogService.open({ message: ['Apagados com sucesso!'] });
    this.dialogService.confirmed().subscribe(afterClosed => { this.router.navigate(['/home']); });    
    
  }

}
