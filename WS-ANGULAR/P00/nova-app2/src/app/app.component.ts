import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';
import { RouterEvent, RouterLinkActive, RouterLink,RouterOutlet } from '@angular/router';
import { MyComponentComponent } from './my-component/my-component.component';


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [RouterOutlet, RouterLink, RouterLinkActive, MyComponentComponent],
})
export class AppComponent {
  title = 'minha-app';
  meuNomePai: string= 'teixeira';
contadorPAI: number = 0;
atualizar(valor: number): void{
  this.contadorPAI = valor;
}
}
