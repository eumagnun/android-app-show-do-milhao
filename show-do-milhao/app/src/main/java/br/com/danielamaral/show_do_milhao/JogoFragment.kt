package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import br.com.danielamaral.show_do_milhao.databinding.FragmentJogoBinding


class JogoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding:FragmentJogoBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_jogo,container,false)

        binding.tvPergunta.text = Database.perguntas[0].texto
        binding.rbResposta1.text = Database.perguntas[0].respostas[0].texto
        binding.rbResposta2.text = Database.perguntas[0].respostas[1].texto
        binding.rbResposta3.text = Database.perguntas[0].respostas[2].texto

        binding.btResponder.setOnClickListener {
            val checkedId = binding.rgRespostas.checkedRadioButtonId
            val respostaSelecionada:String;
            when (checkedId){
                binding.rbResposta1.id -> respostaSelecionada = binding.rbResposta1.text.toString()
                binding.rbResposta2.id -> respostaSelecionada = binding.rbResposta2.text.toString()
                else -> respostaSelecionada = binding.rbResposta3.text.toString()
            }

            validarResposta(respostaSelecionada)
        }
        return binding.root
    }

    private fun validarResposta(respostaSelecionada: String) {
        var isRespostaCorreta = false
        Database.perguntas[0].respostas.forEach {resposta ->
            if(respostaSelecionada.equals(resposta.texto) && resposta.correta){
                isRespostaCorreta = true
            }
        }
        Log.i("RESPOSTA","$respostaSelecionada.CORRETO? ${isRespostaCorreta}")
    }

}