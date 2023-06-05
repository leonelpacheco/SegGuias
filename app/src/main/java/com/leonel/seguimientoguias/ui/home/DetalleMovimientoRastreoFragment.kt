package com.leonel.designandroid.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.leonel.seguimientoguias.databinding.FragmentDetalleMovimientoRastreoBinding


class DetalleMovimientoRastreoFragment : Fragment() {

    private var _binding: FragmentDetalleMovimientoRastreoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(DetalleMovimientoRastreoFragmentViewModel::class.java)


        // var rootView = inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentDetalleMovimientoRastreoBinding.inflate(inflater, container, false)
        val root: View = binding.root //TODO tu codigo va bajo este

/*        binding.button.text="Continuar"

        binding.button.setOnClickListener {

        }*/

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