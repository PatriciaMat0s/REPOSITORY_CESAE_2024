import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-segunda-pagina',
  standalone: true,
  imports: [RouterLink, RouterLinkActive, RouterOutlet],
  templateUrl: './segunda-pagina.component.html',
  styleUrl: './segunda-pagina.component.scss'
})
export class SegundaPaginaComponent {

}
