<?php

use Illuminate\Support\Facades\Route;
use Faker\Guesser\Name;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UsersController;

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

Route::get('/', function () {
    return view('welcome');
}) -> name('bemvindos');





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


//rOTA DE UTILIZADORES:
// Route::get ('utilizadores', function () {
//     return view('utilizadores.utilizadores');
// });





// **********edicao pos controllers:

//******acrescentámos:
Route::get('/home', [IndexController:: class, 'index'])->name('home.index');
// ] () {
//     // return view('main.home'); //apagamos pois +assa,os para os controllers
// });




//ROTAS DE USERS:

Route::get('/users/add', [UsersController:: class, 'addUsers'])->name('users.add');

// Route::get ('/users/add', function () { //nome frontend - por utilizadores/add no browser
//     // return view('users.add_user'); >>>meti na fincao addusers dos usercontrollers
// }) -> name('users.add'); //nome backend


// Route::get('/users/all', function () {
//     return view ('users.all_users');
// })->name('users.all');//nome backend

// Passa a ser assim depois de ter a fincao no controller:
Route::get('/users/all', [UsersController:: class, 'allUsers'])->name('users.all');//nome backend


Route::fallback (function () {
    return'<h2>UPS AHHHH está perdido!</h2>';
});
