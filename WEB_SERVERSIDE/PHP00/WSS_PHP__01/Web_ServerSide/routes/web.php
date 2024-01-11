<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
}) -> name('bemvindos');




//******acrescentámos:
Route::get('/home', function () {
    return view('main.home');
});

// rotas com parametros:
// funcao chamada directamente
//ponto: concatenaçao
Route::get('/hello/{nome}', function ($nome) {
    return view('<h1>HELLO TURMA!</h1>'.$nome);
});

Route::get('/hello/', function () {
    return '<h1>HELLO TURMA!</h1>';
});

// //CHAMAR A ROTA PELO NOME
// Route::get('/hello/', function () {
//     return view('<h1>HELLO TURMA!');
// })->name('contacts.show');

//ROTAS COM FALLBACK - qdo nenhuma das outras routes é invocada:

Route::fallback (function () {
    return'<h2>UPS AHHHH está perdido!</h2>';
});

//rOTA DE UTILIZADORES:
// Route::get ('utilizadores', function () {
//     return view('utilizadores.utilizadores');
// });

Route::get ('/utilizadores/add', function () { //nome frontend - por utilizadores/add no browser
    return view('users.add_user');
}) -> name('users.add'); //nome backend

