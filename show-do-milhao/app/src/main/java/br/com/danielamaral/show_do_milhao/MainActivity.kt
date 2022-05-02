package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

//todo fragment-intro explicar as motivações do fragment
//todo fragment-intro explicar que vamos usar um novo modo de navegação entre telas
//todo fragment-intro explicar que vamos observar algumas diferenças no ciclo de vida
//todo fragment-intro criar primeiro fragment blank
//todo fragment-intro apagar excesso de codigo
//todo fragment-intro configurar Databinding

/*todo fragment-intro
* id kotlin-kapt
* buildFeatures{ dataBinding true   }
* */
//todo fragment-intro mostrar como exibir fragment na Activity
//todo fragment-intro configurar navigation-graph
//todo fragment-intro explicar que o navigation-graph possui seu próprio fragment
//todo fragment-intro  alterar layout da mainActivity para incluir NavHostFragment (precisa dar rebuild antes)
//todo fragment-intro  alterar ID
//todo fragment-intro  incluir atributo app:navGraph="@navigation/navigation" e app:defaultNavHost="true"
//todo fragment-intro  alterar a navegacao via designer do navigation
//todo fragment-intro  criar segundo fragment
//todo fragment-intro  DESAFIO PARA CASA:  IMPLEMENTAR ALEATORIEDADE
//todo fragment-intro  implementar navegacao da home para o game



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}