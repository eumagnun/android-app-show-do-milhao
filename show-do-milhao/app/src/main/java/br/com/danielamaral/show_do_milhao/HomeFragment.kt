package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import br.com.danielamaral.show_do_milhao.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        //implementar após "DESAFIO PARA CASA:  IMPLEMENTAR ALEATORIEDADE"
        binding.btJogar.setOnClickListener {view->
            view.findNavController().navigate(R.id.action_homeFragment_to_jogoFragment)
        }
        return binding.root
    }
}