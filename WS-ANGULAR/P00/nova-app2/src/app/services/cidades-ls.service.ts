import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';


@Injectable({
  providedIn: 'root'
})
export class CidadesService {
  cidades: Array<ICidade> = [];
  //apagámos os dados para o let no else mais adioante

  // Trocar isto 
  // {nome: string, pais: string, populacao: number, }
  // por ICidade

  //vai ser a nossa key
  
  constructor() {
    //fazer debug:
    console.log('localStorage.getItem("cidades")', localStorage.getItem("cidades"));
    // console.log('if', localStorage.getItem("cidades"));
//este if deu origem ao ! seguinte

    if(!localStorage.getItem('cidades')) {

  //     let cidades: Array<ICidade>  = [
  //       {id: 1, nome: 'Porto', pais: 'Portugal', populacao: 78450},
  //       {id: 2, nome: 'Berlin', pais: 'Alemanha', populacao: 178450},
  //       {id: 3, nome: 'Veneza', pais: 'Italia', populacao: 91450},
  //       {id: 4, nome: 'Viseu', pais: 'Portugal', populacao: 580450},
  //       {id: 5, nome: 'Setúbal', pais: 'Portugal', populacao: 78450},
      
  // ];

  //   this.cidades = cidades; //atualizacao de variaveis

  //   localStorage.setItem('cidades', JSON.stringify(cidades));
  this.reporDados();
    }
    else{
      this.readAll();
    }
  }


  limparDados(): void{
// localStorage.removeItem('cidades');
// localStorage.clear();
localStorage.removeItem('cidades');
this.cidades = [];

let cidades: Array<ICidade>  = [
  {id: 1, nome: 'Porto', pais: 'Portugal', populacao: 78450},
  {id: 2, nome: 'Berlin', pais: 'Alemanha', populacao: 178450},
  {id: 3, nome: 'Veneza', pais: 'Italia', populacao: 91450},
  {id: 4, nome: 'Viseu', pais: 'Portugal', populacao: 580450},
  {id: 5, nome: 'Setúbal', pais: 'Portugal', populacao: 78450},

];

this.cidades = cidades;
localStorage.setItem('cidades', JSON.stringify(cidades));
  }
  
  reporDados(): void{
    let cidades: Array<ICidade>  = [
      {id: 1, nome: 'Porto', pais: 'Portugal', populacao: 78450},
      {id: 2, nome: 'Berlin', pais: 'Alemanha', populacao: 178450},
      {id: 3, nome: 'Veneza', pais: 'Italia', populacao: 91450},
      {id: 4, nome: 'Viseu', pais: 'Portugal', populacao: 580450},
      {id: 5, nome: 'Setúbal', pais: 'Portugal', populacao: 78450},
    ];

    this.cidades = cidades;
    localStorage.setItem('cidades', JSON.stringify(cidades));

  }

  //operaçoes CRUD : Create, Read, Update, and Delete

    //adicionar item na nossa lista:
    // create(novaCidade: Array<{nome: string, pais: string, populacao: number}>){


      create(novaCidade: ICidade): void{ 
        //reduce é uma funçao de array
        //let maxID: number =0;
        
        
     /*let maxID: number = 0;
    this.cidades.forEach((item) => {
      if (maxID < item.id) {
        maxID = item.id;
      }
    });*/

    /*const max: ICidade = this.cidades.reduce(
      function name(max: ICidade, item: ICidade): ICidade {
        if(max.id > item.id) {
          return max;
        }
        else{
          return item;
        }
      }
    );*/

//reduce e ummetodo que vai ter um preview valido

       //vou receber uma nova cidade do tipo Icidade

       //a funçao create vai emter esses atributos no formulario, cidades, pais e populaçao, ele cria o objeto e adiciona a lista quando carregas no ok

       const maxID: ICidade = this.cidades.reduce(
        (max: ICidade, item: ICidade) => max.id > item.id ? max : item
      );
      
      novaCidade.id = maxID.id + 1;
   
        this.cidades.push(novaCidade);
        localStorage.setItem('cidades', JSON.stringify('this.cidades'));

        //fazer debug:
        console.log(this.cidades);
      }

      readAll(): void {
        let cidades: Array<ICidade> = JSON.parse(localStorage.getItem('cidades') || '') 
        //se vir que e undefined ou nulo devolve string vazia, dava erro e o prof meteu o ||
          this.cidades = cidades;
      }

      read(id: number): ICidade{
          return this.cidades.filter(x => id === id)[0];
          //sempre q a cond for verdade, vai retoirnar um filtro c os ids
      }

      update(cidade: ICidade): void {
        //cidade é um objecto
        let index: number = this.cidades.findIndex((x: ICidade) => x.id === cidade.id);
        this.cidades[index] = cidade;

        localStorage.setItem('cidades', JSON.stringify(this.cidades));
      }

      delete(cidade: ICidade): void { }


    }
    

  