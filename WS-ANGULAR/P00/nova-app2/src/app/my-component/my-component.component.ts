import { Component, EventEmitter, Input, Output, OnChanges, SimpleChanges, Signal } from '@angular/core';

@Component({
  selector: 'app-my-component', 
  //  selector: 'amc' - personalizar
  standalone: true,
  imports: [],
  templateUrl: './my-component.component.html',
  styleUrl: './my-component.component.scss'
})

export class MyComponentComponent implements OnChanges{
//prof tem clas Mycomponent.component
// se o input() n tem parametro vai dar tito, se tiver de ter paramentro fica assim:
// @Input({required: true}) meuNome: string = 'Tito'
// @Input({alias: 'meu-nome' }) meuNome: string = 'Tito'
//posso nao colocar a palavra alias:
@Input('meu-nome') meuNome: string = 'Tito'

mensagem: string ='🍭🍡🍾'
imagem: string = 'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500';

@Output() mudancaContador: EventEmitter<number> = new EventEmitter<number>();
contador: number = 0;

imagens: string[] =[
'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500', //posiçao 0 do array
'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg',
'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500',
];




num: number = 1;
obj: {id: number, nome: string}={
id: 80,
nome: 'joaninha voa voa'
};

 pCorTexto: string  = '#336699';
 pCorFundo: string  = '#ppccff';
pAlterarCores: boolean = true;

ngOnChanges(changes: SimpleChanges){
  console.log('MyComponentComponent.ngOnChanges()', changes);
  if(changes['meuNome']){
    console.log('O meuNome foi alterado para ' + changes['meuNome'].currentValue);
  }

  if(changes['meuNome2']){
 //podemos colocar mais ifs
  }
}

//funcao - altera 1X a imagem:
alterarImagem(): void {
  //variaveis da classe levam this:
  let aaa: string = '';
  this.imagem = this.imagens[1];
  // this.obj.nome = '';
}

alterarImagem2(): void {
  this.imagem = this.imagens[2];
  // this.imagem = 'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg';
}

alterarCores(): void {
  let auxCor: string = this.pCorTexto;
  this.pCorTexto = this.pCorFundo;
  this.pCorFundo= auxCor;
}

alterarAtivo(): void{
  this.pAlterarCores = false;
}

incrementar(): void{
  this.contador++;
  this.mudancaContador.emit(this.contador);
}


}
