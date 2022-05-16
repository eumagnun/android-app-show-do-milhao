package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import br.com.danielamaral.show_do_milhao.databinding.ActivityMainBinding

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
//todo fragment-intro  DESAFIO PARA CASA:  IMPLEMENTAR DEMAIS NAVEGACOES
//todo fragment-intro  DESAFIO PARA CASA:  PORQUE AS PERGUNTAS NAO ESTÃO MUDANDO?
//todo fragment-intro  Falar do ciclo de vida do fragment
//todo corrigir chamada da aleatoriedade
//todo single activity ???
//https://oozou.com/blog/reasons-to-use-android-single-activity-architecture-with-navigation-component-36
//https://www.youtube.com/watch?v=2k8x8V77CrU
//todo ajusta back action em navigation. Telas de endgame deve direcionar para home
//todo implementar back button nos fragments


//todo NOVAS TAREFAS
//altear layout tela de vitoria e derrota para exibir nome do playr
//altearr layout tela de hoe
//todo criar classe jogador
//todo alterar database
//todo setar jogador no banco fake
//todo implementar snackbar
//todo implementa data variable da tela de GANHOU
//todo ajustar classe ganhou para passar valor
//todo DESAFIO: implementa data variable da tela PERDEU


//todo view model e livedata
//todo incluir dependência
//todo criar classe ViewModel
//todo criar variável ViewModel no fragment
//todo injetar viewModel no fragment através do ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //implementar aqui apenas depois de "implementar back button nos fragments"
        val navController = this.findNavController(R.id.fNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    //implementar aqui apenas depois de "implementar back button nos fragments"
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fNavHostFragment)
        return navController.navigateUp()
    }
}