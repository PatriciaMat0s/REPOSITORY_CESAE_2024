<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;


class UserController extends Controller
{
    public function allUsers(){
        $hello = 'Finalmente vamos para código';
        $helloAgain = 'cucu';

        $daysOfWeek = $this->getWeekDays();
        $info = $this->info();

        $users = $this->getContacts();

        //dd($users);

        return view('users.all_users', compact(
            'hello',
            'helloAgain',
            'daysOfWeek',
            'info',
            'users'
        ));
    }

    public function viewUser($id){

        // $myUser = DB::table('users')
        //         ->where('id',$id )
        //         ->first();
    }

        public function deleteUser($id){

        Db::table('tasks')
        ->where('user_id', ($id))
        ->delete();

        Db::table('users')
        ->where('id', ($id))
        ->delete();

        return back();
        // view('users.view', compact('myUser'));
    }

    public function addUser(){

        // DB::table('users')
        // ->updateOrInsert(
        //     [
        //         'email'=> 'Lais@gmail.com',
        //     ],
        //     [
        //         'name'=> 'Lais',
        //         'password'=> 'sarateste',
        //         'updated_at' => now(),
        //         'created_at' => now(),
        // ]);


        // $users = Db::table('users')
        // ->get();

        // $myUser = DB::table('users')
        // ->where('password', '12345')
        // ->first();

        // //dd($myUser);

       return view('users.add_user');
    }


    public function createUser(Request $request){
        $request->validate([
            'email' => 'required|unique:users',
            'name' => 'required|string|max:10',
        ]);

       // dd($request->password());
        // dd($request->all());

        User::insert([
            'email' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password),
        ]);
        return redirect()->route('users.all')->with('message', 'Boa, estamos a caminho de ter uma super app com utilizadores adicionados!');
    }
       
    
    public function updateUser(Request $request){

        $request->validate([
            'phone' => 'min:9|max:15',
        ]);

        // dd($request->all());
        User::where('id', $request->id)
        ->update([
            'name' => $request->name, 
            'address' => $request->address, 
            'phone' => $request->phone
        ]);
    }


    private function getWeekDays(){

        $daysofWeek = ['Segunda', 'Terça', 'Quarta', 'Quinta'];

        return $daysofWeek;
    }

    private function info(){

        $courseInfo = [
            'name' => 'Software Developer',
            'year' => 2024,
            'modules' => ['PHP', 'WebServices', 'Java'],
            ['Teste', 4, 'Sofia', 'João']
        ];

        return  $courseInfo;
    }

    private function getContacts(){

        // $users = [
        //     ['id'=>1, 'name'=>'Sara', 'phone'=>'91222222', 'email'=> 'sara@gmail.com'],
        //     ['id'=>2, 'name'=>'Joaquim','phone'=> '91222222',  'email'=>'Joaquim@gmail.com'],
        //     ['id'=>3, 'name'=>'Helder','phone'=> '91222222',  'email'=>'Helder@gmail.com'],
        //     ['id'=>4, 'name'=>'Bruno', 'phone'=>'91222222',  'email'=>'Bruno@gmail.com'],
        // ];

         $users = DB::table('users')
            ->whereNull('updated_at')
           ->get();

        //$users = User::get();

        $adminType = User::TYPE_ADMIN;

        return $users;

    }
}