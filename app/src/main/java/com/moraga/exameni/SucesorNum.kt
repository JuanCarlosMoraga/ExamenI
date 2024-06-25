package com.moraga.exameni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moraga.exameni.databinding.FragmentSucesorNumBinding


class SucesorNum : Fragment() {

    lateinit var binding: FragmentSucesorNumBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSucesorNumBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnSucesor.setOnClickListener {
            val numIn = binding.TfNum.editText?.text.toString()
            if (numIn.isNotEmpty()) {
                val num:Int = numIn.toInt()
                val sucesor: Int = num + 1
                val cubo: Int = sucesor * sucesor * sucesor
                binding.TvResultadoS.text = "Sucesor: ${sucesor.toString()}, Cubo: ${cubo.toString()}"
            }
            else{
            binding.TvResultadoS.text = "Por Favor ingrese un numero"
            }
        }
    }
}