package br.com.danielamaral.show_do_milhao

import android.util.Log
import androidx.lifecycle.ViewModel

class JogoViewModel:ViewModel() {
    init{
        Log.i("GameViewModel","GameViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel","GameViewModel Destroyed")

    }
}