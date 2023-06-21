import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

// -> material itens
import { MatDialogModule } from '@angular/material/dialog';
// import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

// -> service
import { DialogService } from './dialog.service';

import { NotificationComponent } from './notification/notification.component';
import { AnotacaoFaseComponent } from './anotacao-fase/anotacao-fase.component';


@NgModule({
  declarations: [
    NotificationComponent,
    AnotacaoFaseComponent
  ],
  imports: [
    CommonModule,
    FormsModule, 
    ReactiveFormsModule,
    MatDialogModule,
    // MatButtonModule,
    MatIconModule,
  ],
  exports: [
    NotificationComponent,
    AnotacaoFaseComponent
  ],
  entryComponents: [
    NotificationComponent,
    AnotacaoFaseComponent
  ],
  providers: [
    DialogService
  ]
})
export class DialogModule { }
