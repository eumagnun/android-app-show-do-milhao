package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.danielamaral.show_do_milhao.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        //implementar após "DESAFIO PARA CASA:  IMPLEMENTAR ALEATORIEDADE"
        binding.btJogar.setOnClickListener {
            val nome = binding.etNomeJogador.text.toString()
            if (nomeValido(nome)) {
                Database.jogador.nome = nome
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_jogoFragment)
            } else {
                val mySnackbar = Snackbar.make(
                    binding.root,
                    "Nome do jogador inválido!", Snackbar.LENGTH_SHORT
                )
                mySnackbar.show()

            }
        }
        return binding.root
    }

    private fun nomeValido(nome: String): Boolean {
        return nome != null && !"".equals(nome)
    }
}