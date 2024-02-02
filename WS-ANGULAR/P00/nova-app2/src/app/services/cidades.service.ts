//


import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';


@Injectable({
  providedIn: 'root'
})
export class CidadesService {
  cidades: Array<ICidade> = [
    {nome: 'Porto', pais: 'Portugal', populacao: 78450},
    {nome: 'Aveiro', pais: 'Portugal', populacao: 181494},
    {nome: 'Barcelona', pais: 'Espanha', populacao: 1620343},
    {nome: 'Paris', pais: 'França', populacao: 2148271},
    {nome: 'Berlim', pais: 'Alemanha', populacao: 3645000}
  ];

  // Trocar isto 
  // {nome: string, pais: string, populacao: number, }
  // por ICidade

  constructor() {}

    //adicionar item na nossa lista:
    // create(novaCidade: Array<{nome: string, pais: string, populacao: number}>){
    create(novaCidade: ICidade){ //vou receber uma nova cidade do tipo Icidade
      this.cidades.push(novaCidade);
    }
//push: adicionar uma cidade no fim
  
}
