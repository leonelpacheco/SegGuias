package com.leonel.designandroid.ui.home

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.leonel.seguimientoguias.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

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
            ViewModelProvider(this).get(HomeViewModel::class.java)


        // var rootView = inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root //TODO tu codigo va bajo este

        binding.button.text="Continuar"

        binding.button.setOnClickListener {

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