<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});


//acrescentámos:
Route::get('/home', function () {
    return view('welcome');
});

// rotas com parametros:
// funcao chamada directamente
//ponto: concatenaçao
Route::get('/hello/{nome}', function ($nome) {
    return view('<h1>HELLO TURMA!</h1>'.$nome);
});

Route::get('/hello/', function () {
    return view('<h1>HELLO TURMA!</h1>');
});

//CHAMAR A ROTA PELO NOME
Route::get('/hello/', function () {
    return view('<h1>HELLO TURMA!');
})->name('contacts.show');