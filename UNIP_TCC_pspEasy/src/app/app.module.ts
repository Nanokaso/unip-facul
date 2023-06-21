import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HashLocationStrategy, LocationStrategy } from '@angular/common';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


// import { MatButtonToggleModule } from '@angular/material/button-toggle';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatProgressBarModule } from '@angular/material/progress-bar';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

import { DialogModule } from './widgets/dialog/dialog.module';

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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    PadraoComponent,
    BlankComponent,
    PrimeiroAcessoComponent, 
    HomeComponent,
    SplashComponent,
    FavoritosComponent,
    ConfiguracoesComponent,
    SobreComponent,
    ProjetoCadastrarComponent,
    ProjetoEditarComponent,
    ProjetoHomeComponent,
    ProjetoFaseComponent,    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,  
    FormsModule,
    ReactiveFormsModule,

    MatButtonModule,
    MatDialogModule,
    MatIconModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    BrowserAnimationsModule,

    DialogModule,    
  ],
  providers: [
    { provide: LocationStrategy, useClass: HashLocationStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
