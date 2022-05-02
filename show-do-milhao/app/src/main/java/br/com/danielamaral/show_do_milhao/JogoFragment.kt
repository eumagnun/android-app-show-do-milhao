package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.danielamaral.show_do_milhao.databinding.FragmentJogoBinding
import br.com.danielamaral.show_do_milhao.model.Pergunta


class JogoFragment : Fragment() {

    var perguntaSelecionada = embaralharPerguntasRepostas(Database.perguntas)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentJogoBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_jogo, container, false)

        binding.tvPergunta.text = perguntaSelecionada.texto
        binding.rbResposta1.text = perguntaSelecionada.respostas[0].texto
        binding.rbResposta2.text = perguntaSelecionada.respostas[1].texto
        binding.rbResposta3.text = perguntaSelecionada.respostas[2].texto

        binding.btResponder.setOnClickListener {
            val checkedId = binding.rgRespostas.checkedRadioButtonId
            val respostaSelecionada: String;
            when (checkedId) {
                binding.rbResposta1.id -> respostaSelecionada = binding.rbResposta1.text.toString()
                binding.rbResposta2.id -> respostaSelecionada = binding.rbResposta2.text.toString()
                else -> respostaSelecionada = binding.rbResposta3.text.toString()
            }

            if(validarResposta(respostaSelecionada)){
                view?.findNavController()?.navigate(R.id.action_jogoFragment_to_ganhouFragment)
            }else{
                view?.findNavController()?.navigate(R.id.action_jogoFragment_to_perdeuFragment)
            }
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        perguntaSelecionada = embaralharPerguntasRepostas(Database.perguntas)
    }

    private fun validarResposta(respostaSelecionada: String):Boolean {
        var isRespostaCorreta = false
        Database.perguntas[0].respostas.forEach { resposta ->
            if (respostaSelecionada.equals(resposta.texto) && resposta.correta) {
                isRespostaCorreta = true
            }
        }
        Log.i("RESPOSTA", "$respostaSelecionada.CORRETO? ${isRespostaCorreta}")
        return isRespostaCorreta
    }

    private fun embaralharPerguntasRepostas(perguntas: MutableList<Pergunta>): Pergunta {
        perguntas.shuffle()
        val pergunta = perguntas[0]
        pergunta.respostas =  pergunta.respostas.shuffled()
        return pergunta
    }

}