package br.com.danielamaral.show_do_milhao

import br.com.danielamaral.show_do_milhao.model.Pergunta
import br.com.danielamaral.show_do_milhao.model.Resposta

class Database {

    companion object {
        val perguntas = mutableListOf<Pergunta>()

        init {
            val perguntaA = "Qual o time sem mundial?"
            val respostaA1 = Resposta("Corinthians", false)
            val respostaA2 = Resposta("Palmeiras", true)
            val respostaA3 = Resposta("Vasco", false)
            val listaRespostasA = listOf(respostaA1, respostaA2, respostaA3)
            perguntas.add(Pergunta(perguntaA, listaRespostasA))

            val perguntaB = "Qual a melhor banda do mundo?"
            val respostaB1 = Resposta("Could Play", true)
            val respostaB2 = Resposta("Metallica", false)
            val respostaB3 = Resposta("Chiclete com Banana", false)
            val listaRespostasB = listOf(respostaB1, respostaB2, respostaB3)
            perguntas.add(Pergunta(perguntaB, listaRespostasB))

            val perguntaC = "Qual a melhor banda do mundo?"
            val respostaC1 = Resposta("Could Play", true)
            val respostaC2 = Resposta("Metallica", false)
            val respostaC3 = Resposta("Chiclete com Banana", false)
            val listaRespostasC = listOf(respostaC1, respostaC2, respostaC3)
            perguntas.add(Pergunta(perguntaC, listaRespostasC))
        }
    }
}