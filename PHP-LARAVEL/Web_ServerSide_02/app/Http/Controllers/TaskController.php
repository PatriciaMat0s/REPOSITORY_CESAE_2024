<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function allTasks(){

        $tasks = $this->getAllTasks();

        return view('tasks.all_tasks', compact('tasks'));
    }


//meti eu:
public function viewTask($id){

    $myTask = DB::table('tasks')
                ->join('users', 'user_id','=','users.id')
                ->select('tasks.*', 'users.name as usname')
                ->first();
}

    public function deleteTask($id){

    Db::table('tasks')
    ->where('id', ($id))
    ->delete();

    return back();
    // view('users.view', compact('myUser'));
}



    private function getAllTasks(){
        $tasks = DB::table('tasks')
                ->join('users', 'user_id','=','users.id')
                ->select('tasks.*', 'users.name as usname')
                ->get();

        return $tasks;
    }



    


}
