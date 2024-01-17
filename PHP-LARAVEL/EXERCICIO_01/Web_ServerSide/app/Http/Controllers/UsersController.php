<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;



class UsersController extends Controller
{
    public function addUsers(){

        dd('test1'); //dump and die - ferramenta debug canto sup esquero aparece o array q queremos testar se esta ok
        //a execucao vai parar aqui, na
        return view('users.add_user');
    }


     public function allUsers(){
        $hello = 'Finalmente vamos para código';
        $helloYay = 'cucu';
        $daysOfWeek = $this->getWeekDays();
        $info = $this->getInfo();
        $users= $this->getContacts();

        return view('users.all_users', compact(
            'hello', //assign variaveis
            'helloYay',
            'daysOfWeek',
            'info',
            'users'
));
}

    private function getWeekdays(){
        $daysofWeek = ['Segunda','Terca','Quarta', 'Quinta', 'Sexta'];
        return $daysofWeek;
    }

    private function getInfo(){
        //courseInfo: array associativo, em vez de indexes temos keys:
        //array associativo é um array que tem arrays dentro
        $courseInfo=[
            'name' => 'software developer', //nome é key
            'year' => 2024,
            'modules' => ['PHP', 'WEBSWERVICES', 'Java'],
            ['Teste', 4, 'Sofia', 'Joao']
        ]; //fecho o do array assoc $courseInfo=[

            return $courseInfo;
    }



    private function getContacts(){
$users = [
        ['id'=>1, 'name'=>'Sara', 'phone'=>'91222222', 'email'=> 'sara@gmail.com'],
        ['id'=>'2', 'name'=>'Joaquim','phone'=> '91222222',  'email'=>'Joaquim@gmail.com'],
        ['id'=>'3', 'name'=>'Helder','phone'=> '91222222',  'email'=>'Helder@gmail.com'],
        ['id'=>'4', 'name'=>'Bruno', 'phone'=>'91222222',  'email'=>'Bruno@gmail.com'],
    ];

    return $users;

}


}

