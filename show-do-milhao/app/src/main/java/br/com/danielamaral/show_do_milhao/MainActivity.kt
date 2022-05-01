package br.com.danielamaral.show_do_milhao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//todo fragment-intro explicar as motivações do fragment
//todo fragment-intro explicar que vamos usar um novo modo de navegação entre telas
//todo fragment-intro explicar que vamos observar algumas diferenças no ciclo de vida
//todo fragment-intro criar primeiro fragment blank
//todo fragment-intro apagar excesso de codigo
//todo fragment-intro configurar Databinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}