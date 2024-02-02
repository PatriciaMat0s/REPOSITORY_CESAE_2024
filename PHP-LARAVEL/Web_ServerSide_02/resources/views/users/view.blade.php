@extends('layouts.femaster')~

@section('content')

<h1>Cucu, ver um user</h1>
    <h1> Ver / Actualizar Dados {{ $myUser->name }}</h1>
    <form method="POST" action="{{ route('users.create') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{ $myUser->name }}" name="name" class="form-control" id="exampleFormControlInput1"
                placeholder="Nome" required>
            @error('name')
                <div class="alert alert-danger">
                    O nome que colocou é inválido.
                </div>
            @enderror
        </div>
        
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input type="email" name="email"  value="{{$myUser->email}}" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" >
            @error('email')
                <div class="alert alert-danger">OUPS o email que colocou ja está registado</div>
            @enderror
          </div>
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Morada</label>
            <input type="texto" name="morada" class="form-control" id="exampleFormControlInput1" placeholder="Morada" >
          </div>

          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{ route('home.index') }}">Voltar</a>    <br>
    <br>

    </div>
@endsection
