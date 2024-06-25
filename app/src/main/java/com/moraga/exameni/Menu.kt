package com.moraga.exameni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moraga.exameni.databinding.FragmentMenuBinding


class Menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMenuBinding
        binding = FragmentMenuBinding.inflate(layoutInflater)

        binding.BtnCuadrado.setOnClickListener {
            findNavController().navigate(R.id.cuadradoNum)
        }
        binding.BtnRaiz.setOnClickListener {
            findNavController().navigate(R.id.raizNum)
        }
        binding.BtnAntecesor.setOnClickListener {
            findNavController().navigate(R.id.antecesorNum)
        }
        binding.BtnSucesor.setOnClickListener {
            findNavController().navigate(R.id.sucesorNum)
        }
        return binding.root
    }
}