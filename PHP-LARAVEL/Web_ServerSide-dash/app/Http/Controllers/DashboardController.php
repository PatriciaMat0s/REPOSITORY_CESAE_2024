<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
    
    //funçao para onde a rota encaminha e nos dá a view do dashboard backoffice:
    public function backOffice() {

        return view('backoffice');
    }


}
