package com.moraga.exameni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moraga.exameni.databinding.FragmentAntecesorNumBinding


class AntecesorNum : Fragment() {

    lateinit var binding: FragmentAntecesorNumBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAntecesorNumBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnAntecesor.setOnClickListener {
            val numStr = binding.TfNum.editText?.text.toString()
            if (numStr.isNotEmpty()) {
                val num: Int = numStr.toInt()
                val antecesor = num - 1
                binding.TvResultadoA.text = "El antecesor es: ${antecesor.toString()}"
            }
            else {
                binding.TvResultadoA.text = "Por Favor ingrese un numero"
            }
        }
    }
}