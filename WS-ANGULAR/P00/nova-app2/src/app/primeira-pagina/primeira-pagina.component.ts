import { Component } from '@angular/core';
import { MyComponentComponent } from '../my-component/my-component.component';

@Component({
  selector: 'app-primeira-pagina',
  standalone: true,
  imports: [MyComponentComponent],
  templateUrl: './primeira-pagina.component.html',
  styleUrl: './primeira-pagina.component.scss',
  // template
  // style
  // podiamos fazer uma edicao local, mas o melhor é global
})
export class PrimeiraPaginaComponent {

  meuNomePai: string = "Matos";
  contadorPAI: number = 0;

  atualizar(valor: number): void {
    this.contadorPAI = valor;
  } 

changeMeuNomePai(){
  this.meuNomePai ='Miguel'
}

}
