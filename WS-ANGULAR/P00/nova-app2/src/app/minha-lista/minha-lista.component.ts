import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';
import { CidadesService } from '../services/cidades-ls.service';
import { ICidade } from '../models/cidade.model';
import { Router, RouterLink } from '@angular/router';
 
@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent, RouterLink],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss'
})
export class MinhaListaComponent {
  cidades: Array<ICidade> = [
   
  ];


// ciclos de vida
// seja html seja js o constr e a 1a coisa ser executada
//parametros sao injecçao de dependencias - dependency injections

// ATENÇAO:::injecoes de dados sp feitas dentro dos construtores
//DADOS É O QUE PRECISA DE UM SERVIÇO
//GUARDAR LOGS E REGISTOS DA NAVEGAÇAO DO USER, TB DEFS DA APP
//OS SERVIÇSO SAO SINGLETONS, PARA POUPAR MEMORIA

constructor
  (private cidadesService: CidadesService, private router: Router){

  //router é uma injecao de dependencias e é injetado no construtor
console.log('MinhaListaComponent.constructor()');

//trazer os dados das cities p dentro desta lista:
// this.cidades = cidadesService.cidades;
// mudar para OnInit pois no construtor so se mete os dados e nao a logica, meter o private
//construtor sendo njectvael vai preencher automaticament
}

//hook - cada hook tem uma responsabilidade d«no ciclio de vida
//sao executados por ordem caso de executarem
//parametros: vamos receber qual o valor que esta a ser alterado e qual o novo valor


ngOnChange(){
  /* É executado sempre que o Angular deteta
  uma mudança em uma propriedade de entrada (@Input).
  Recebe um objeto do tipo SimpleChanges que contém os
  valores atuais e anteriores das propriedades alteradas */

  console.log('MinhaListaComponent.ngOnChange()');
}
//nOC executado qdo o angular deteta 


ngOnInit(){
  /*É executado uma vez depois que o Angular
  termina de inicializar as propriedades de entrada. É usado
  para realizar operações de inicialização que dependem dos
  dados de entrada, como fazer requisições HTTP, atribuir
  valores a propriedades, etc…*/
  //vamos usar bastante
  //tentar usar da framework mais robusta q tiverem

  console.log('MinhaListaComponent.ngOnInit()');

  this.cidadesService = readAll();
  this.cidades = this.cidadesService.cidades;
}

//o create instancia um obejcto
adicionarCidade(){
  this.cidadesService.create({id:0, nome: 'Lisboa', pais: 'Portugal', populacao: 878787});
}

irAdicionarCidade(){
  this.router.navigate(['/formulario-cidade-td'])
}

  limparDados(): void{
    this.cidadesService.limparDados();
    this.cidades = this.cidadesService.cidades; 
  }

ngDoCheck(){
  /* É executado a cada ciclo de deteção de
mudanças do Angular, que é o mecanismo que o Angular usa
para verificar se há mudanças nos dados e atualizar a view. É
usado para implementar uma lógica personalizada de
deteção de mudanças, que pode ser mais complexa ou
específica do que a padrão do Angular */

console.log('MinhaListaComponent.ngDoCheck()');

}


ngAfterContentChecked(){
/* É executado depois de cada ciclo
de deteção de mudanças do Angular, depois que o conteúdo
projetado é verificado. É usado para realizar operações que
dependem das mudanças no conteúdo projetado, como
atualizar valores, aplicar estilos, etc… */

}


ngAfterViewInit(){
    /* É executado uma vez depois que o Angular
inicializa a view do e as views dos seus filhos. É usado para
realizar operações que dependem da view, como aceder
elementos DOM, manipular dados, etc… */

}

ngAfterViewChecked(){
  /* É executado depois de cada ciclo de
deteção de mudanças do Angular, depois que a view e as
views dos filhos são verificadas. É usado para realizar
operações que dependem das mudanças na view, como
atualizar valores, aplicar estilos, etc… */
}

ngOnDestroy(){
  //este tambem se usa bastante
  /* É executado uma vez antes que o Angular
destrua o componente ou diretiva. É usado para realizar
operações de limpeza, como cancelar subscrições, desalocar
recursos, remover event listeners, etc… */
}

}


// function readAll(): CidadesService {
//   throw new Error('Function not implemented.');
// }

