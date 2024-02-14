import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component'; 
import { ListaAnimaisComponent } from './lista-animais/lista-animais.component';

import { FormularioCidadeTdComponent } from './formulario-cidade-td/formulario-cidade-td.component';
// ao adicionar {path: 'minha-lista', title: 'Minha Lista', component: MinhaListaComponent}, o respectivo import vem automaticamente

// Routes e PPC sao classes - maiuscula e pascal case em TS


export const routes: Routes = [
{ path: 'primeira', title: 'Primeira Página', component: PrimeiraPaginaComponent},
{ path: 'segunda',
 title: 'Segunda Página', 
 component: SegundaPaginaComponent, 
children: [
    { path: 'aaa', title: 'segunda Página Aaa', component: SegundaAaaPaginaComponent},
    { path: 'aaa',  title: 'segunda Página bbb', component: SegundaBbbPaginaComponent},
],
 },

 {path: 'minha-lista', title: 'Minha Lista', component: MinhaListaComponent},

 {path: 'formulario-cliente-td', title: 'Formulario Cidade', component: FormularioCidadeTdComponent,
},

 
 {path: 'lista-animais', title: 'Minha ListaLista Animais', component: ListaAnimaisComponent,
},



//  {path: 'formulario-cidade-td', title: 'CRIAR Formulário Cidade (template-driven forms)', component: FormularioCidadeTdComponent},

//  {path: 'formulario-cidade-td/:id', title: 'EDITAR Formulário Cidade (template-driven forms)', component: FormularioCidadeTdComponent,},

 {path: 'formulario-cidade-td', 
 children: [
    {
    path: '',
    title: 'Criar Formulário Cidade (template-driven forms)', 
    component: FormularioCidadeTdComponent,
    },
    
    {
    path: ':id',
    title: 'Editar Formulário Cidade (template-driven forms)', 
    component: FormularioCidadeTdComponent,
    }
 ]
},


//  { path: '', title: 'Primeira Página', component: PrimeiraPaginaComponent}, >>>copiado de cima c path vazio ou:
{ path: '', redirectTo: '/primeira', pathMatch: 'full'},

{ path: '', redirectTo: '/minha-lista', pathMatch: 'full'},


// se nao houver rotas - fazer fallback:
{path: '**', title: '404 - pagina nao encontrada', component: NotFoundComponent }, 
// depois de criar o comp not-found no terminal, o NTC deve aparecer automatico
];
