import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UtilsService } from '../../services';


@Component({
  selector: 'app-splash',
  templateUrl: './splash.component.html',
  styleUrls: ['./splash.component.less']
})
export class SplashComponent implements OnInit {

  constructor(
    private router: Router,
    private utilsService: UtilsService
  ) { }

  ngOnInit(): void {

    // espera 4 segundos e então redireciona
    setTimeout(() => {

      if (this.utilsService.isPrimeiroAcesso())
        this.router.navigate(['/primeiro-acesso/']);
      else
        this.router.navigate(['/home/']);
      // this.router.navigate(['/home/']);

    }, 4000);

  }

}
