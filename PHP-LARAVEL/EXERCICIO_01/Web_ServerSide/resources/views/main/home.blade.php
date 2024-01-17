
@extends('layouts.femaster')
@section('content1')
{{-- content1 existe no yiels no femasterblade, allusersblade --}}


<h3>Hello world, estamos nas Views!</h3>
<h5>Tens disponieis estes links:</h5>

<ul>
    <li><a href="{{route('bemvindos')}}">Vai para casa!</a></li>
    <li><a href="{{route('users.all')}}">Todos os users!</a></li>
    <li><a href="{{route('users.add')}}">Aqui podes adicionar users!</a></li>
</ul>

<h2>Dados do Cesae:</h2>
<p>Nome: {{ $cesaeInfo['name'] }}</p>
<p>Morada: {{ $cesaeInfo['address'] }}</p>
<p>E-mail: {{ $cesaeInfo['email'] }}</p>



@endsection

