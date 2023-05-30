package com.leonel.seguimientoguias.ui.home.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.leonel.seguimientoguias.R
import com.leonel.seguimientoguias.databinding.FragmentHomeBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(LoginViewModel::class.java)


        // var rootView = inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root //TODO tu codigo va bajo este

        binding.button.text="Continuar desde login"

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        // val textView: TextView = binding.textHome
/*        homeViewModel.text.observe(viewLifecycleOwner) {
            //textView.text = it
        }*/
        return root  //TODO este debe estar de último siempre
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}