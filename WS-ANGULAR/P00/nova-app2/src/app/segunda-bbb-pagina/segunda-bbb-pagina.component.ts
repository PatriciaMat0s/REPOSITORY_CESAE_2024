import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
// import {  } from '@angular/core'; primeiro escrever de onde e, depois aprecem sugestoes


@Component({
  selector: 'app-segunda-bbb-pagina',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './segunda-bbb-pagina.component.html',
  styleUrl: './segunda-bbb-pagina.component.scss'
})
export class SegundaBbbPaginaComponent {
arr: Array<string> =[
  "Joao",
  "Natana",
  "Atylla",
  "Joana",
  "Ricardo"
]




}
