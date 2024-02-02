@extends('layouts.femaster')
@section('content1')

    <H3>Olá, sou todos os users!</H3>
    <p>{{ $hello }}</p>
    <p>{{ $helloYay }}</p>
    <p>{{ $daysOfWeek[2] }}</p>
    <p>{{ $info['name'] }}</p>
    <p>{{ $info['modules'][0] }}</p>

    {{-- INDICES SAO NUMERICOS DEPOIS DAS KEYS, PARA OBTER "Sofia:" --}}
    <p>{{ $info[0][2] }}</p>

{{--
    <ul>
        @foreach ($users as $user)
        <li>{{$users['name']}} e o email é {{$users['email']}}</li>
        @endforeach
    </ul> --}}


    <table class="table">

        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">NOME</th>
            <th scope="col">TELEFONE</th>
            <th scope="col">EMAIL</th>
          </tr>
        </thead>

        <tbody>
        @foreach ($users as $user)

          <tr>
            <th scope="row">{{$user['id']}}</th>
            <td>{{$user['name']}}</td>
            <td>{{$user['phone']}}</td>
            <td>{{$user['email']}}</td>
          </tr>

        @endforeach
        </tbody>
      </table>


    @endsection
