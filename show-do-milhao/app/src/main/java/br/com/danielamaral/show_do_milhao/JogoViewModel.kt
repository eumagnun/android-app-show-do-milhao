package br.com.danielamaral.show_do_milhao

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.danielamaral.show_do_milhao.model.Pergunta

class JogoViewModel:ViewModel() {

    init{
        Log.i("GameViewModel","GameViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel","GameViewModel Destroyed")

    }

    fun embaralharPerguntasRepostas(perguntas: MutableList<Pergunta>): Pergunta {
        perguntas.shuffle()
        val pergunta = perguntas[0]
        pergunta.respostas =  pergunta.respostas.shuffled()
        return pergunta
    }

    fun validarResposta(perguntaSelecionada:Pergunta, respostaSelecionada: String):Boolean {
        var isRespostaCorreta = false
        perguntaSelecionada.respostas.forEach { resposta ->
            if (respostaSelecionada.equals(resposta.texto) && resposta.correta) {
                isRespostaCorreta = true
                Database.pontuacao=Database.pontuacao+1
            }
        }
        Log.i("RESPOSTA", "$respostaSelecionada.CORRETO? ${isRespostaCorreta}")
        return isRespostaCorreta
    }
}