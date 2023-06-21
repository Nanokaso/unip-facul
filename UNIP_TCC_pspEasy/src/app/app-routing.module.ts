import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Templates
import { PadraoComponent } from './layouts/padrao/padrao.component';
import { BlankComponent } from './layouts/blank/blank.component';

// Paginas
import { SplashComponent } from './pages/splash/splash.component';
import { PrimeiroAcessoComponent } from './pages/primeiro-acesso/primeiro-acesso.component';
import { HomeComponent } from './pages/home/home.component';
import { FavoritosComponent } from './pages/favoritos/favoritos.component';
import { ConfiguracoesComponent } from './pages/configuracoes/configuracoes.component';
import { SobreComponent } from './pages/sobre/sobre.component';
import { ProjetoCadastrarComponent } from './pages/projeto-cadastrar/projeto-cadastrar.component';
import { ProjetoEditarComponent } from './pages/projeto-editar/projeto-editar.component';
import { ProjetoHomeComponent } from './pages/projeto-home/projeto-home.component';
import { ProjetoFaseComponent } from './pages/projeto-fase/projeto-fase.component';

const routes: Routes = [

  // -> Rotas de usuário não logado -> públicas
  { path: '', component: BlankComponent, children: [{ path: '', component: SplashComponent }] },
  { path: '', component: BlankComponent, children: [{ path: 'splash', component: SplashComponent }] },
  { path: '', component: BlankComponent, children: [{ path: 'primeiro-acesso', component: PrimeiroAcessoComponent }] },

  { path: '', component: PadraoComponent, children: [{ path: 'home', component: HomeComponent }] },
  { path: '', component: PadraoComponent, children: [{ path: 'favoritos', component: FavoritosComponent }] },
  { path: '', component: PadraoComponent, children: [{ path: 'configuracoes', component: ConfiguracoesComponent }] },
  { path: '', component: PadraoComponent, children: [{ path: 'sobre', component: SobreComponent }] },
  
  { path: '', component: PadraoComponent, children: [{ path: 'projeto-cadastrar', component: ProjetoCadastrarComponent }] },  
  { path: '', component: PadraoComponent, children: [{ path: 'projeto-editar/:id', component: ProjetoEditarComponent }] },
  { path: '', component: PadraoComponent, children: [{ path: 'projeto-home/:id', component: ProjetoHomeComponent }] },
  { path: '', component: PadraoComponent, children: [{ path: 'projeto-fase/:id/:id1', component: ProjetoFaseComponent }] },


  // -> Rotas de usuário logado
  // { path: '', component: LogadoComponent, children: [{ path: 'a-campanha', component: ACampanhaComponent, canActivate: [AutenticacaoUsuarioGuard] },] },
  
  // -> Rota necessarias do app (devem ficar na ordem definida)
  // { path: 'sessao-expirada', component: NaoLogadoComponent, children: [{ path: '', component: SessaoExpiradaComponent },] },

  /*          pagina não encontrada           */
  { path: '**', component: BlankComponent, children: [{ path: '', component: SplashComponent },] }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
