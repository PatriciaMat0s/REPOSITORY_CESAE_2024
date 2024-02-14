

@extends('layouts.femaster')

@section('content')

<h2>Olá, {{Auth::user()->name}}!</h2>


<!-- entre @auth e endauth,o código só executa se o user estiver autenticado: -->
  @auth

    @if(Auth::user()->user_type == 1)
<!-- o user_type 1 foi definido por nós na BD, com a migracao: 
php artisan make:migration add_user_type_to_users_table 
E depois fui manualmente as tabelas introduzir 1 na coluna user_type com uma password que parecia encriptada, mas ao fazer submoit nao fui reencaminhnada para a view desta blade...-->

<!-- alerta - snippet bootstrap: -->
    <div class="alert alert-success" role="alert">
      Entrou na conta de Administrador, bem-vindo!
    </div>
    @endif

  @endauth


@endsection