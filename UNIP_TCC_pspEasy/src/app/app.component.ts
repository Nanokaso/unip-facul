import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'pspEasy';
  
  constructor(router: Router) {
    // decide what to do when this event is triggered.
  //   router.events.subscribe((event: any) =>{      
  //     // window.history.forward();
  //  })
  }
}