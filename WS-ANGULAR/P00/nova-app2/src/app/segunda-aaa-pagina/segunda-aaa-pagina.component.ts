import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'
// nota: n e preciso , ou ; em js ou ts

@Component({
  selector: 'app-segunda-aaa-pagina',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './segunda-aaa-pagina.component.html',
  styleUrl: './segunda-aaa-pagina.component.scss',
})
export class SegundaAaaPaginaComponent {
 valor: number = 0;

 fn(): void {
  if (this.valor > 0) {
    // ...
  } else if (this.valor === 0) {
    // ...
  } else {
    // ...
  }

  if (this.valor > 0) {
    // ...
  } else {
    if (this.valor === 0) {
      // ...
    } else {
      //...
    }
  }

  switch (this.valor) {
    case 0:
      // valor é igual a 0
      break;
    case 1:
      // valor é igual a 1
      break;
    default:
      // valor não é igual a 1 ou 0
      break;
  }
}
}





