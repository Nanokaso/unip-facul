import { ChangeDetectionStrategy, Component, HostListener, Inject, Output } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';


@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.less']
})
export class NotificationComponent {

  constructor(
    @Inject(MAT_DIALOG_DATA) public data: { customStyle: string, message: string[], btnLabel: string },
    private mdDialogRef: MatDialogRef<NotificationComponent>
  ) { }

  public close(value: boolean) {
    this.mdDialogRef.close(value);
  }

  @HostListener("keydown.esc")
  public onEsc() {
    this.close(false);
  }

}
