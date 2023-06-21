import { Injectable } from '@angular/core';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Observable } from 'rxjs';

import { NotificationComponent } from './notification/notification.component';
import { AnotacaoFaseComponent } from './anotacao-fase/anotacao-fase.component';



@Injectable({
  providedIn: 'root'
})
export class DialogService {

  dialogNotification: MatDialogRef<NotificationComponent>;
  dialogAnotacao: MatDialogRef<AnotacaoFaseComponent>;

  constructor(private dialog: MatDialog) { }

  // -> fechar 
  public resetDialogs(): void {

    if (this.dialogNotification)
      this.dialogNotification.close(false);

    if (this.dialogAnotacao)
      this.dialogAnotacao.close();

  }

  // -> notification
  public open(options: any) {

    var widthOp = options.width;

    if (widthOp == null) {
      widthOp = '300px'; // Default
    }

    if (options.message !== null && options.message.length > 0) {
      this.dialogNotification = this.dialog.open(NotificationComponent, {
        width: widthOp,
        data: {
          customStyle: options.customStyle,
          message: options.message,
          btnLabel: options.btnLabel
        }
      });
    }
  }

  public confirmed(): Observable<any> {
    return this.dialogNotification.afterClosed();
  }

  public openAnotacao(options: any) {
    var widthOp = options.width;

    if (widthOp == null)
      widthOp = '300px'; // Default

    if (options.message !== null) {
      this.dialogAnotacao = this.dialog.open(AnotacaoFaseComponent, {
        width: widthOp,
        data: options
      });
    }
  }

  public confirmedAnotacao(options: any) {
    return this.dialogAnotacao.afterClosed();
  }

}
