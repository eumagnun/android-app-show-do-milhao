package br.com.danielamaral.show_do_milhao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.danielamaral.show_do_milhao.databinding.FragmentPerdeuBinding

class PerdeuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentPerdeuBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_perdeu,container, false)

        binding.btJogarDeNovo.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_perdeuFragment_to_jogoFragment)
        }
        return binding.root
    }

}