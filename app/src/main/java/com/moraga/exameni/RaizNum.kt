package com.moraga.exameni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moraga.exameni.databinding.FragmentRaizNumBinding
import kotlin.math.sqrt


class RaizNum : Fragment() {

    lateinit var binding : FragmentRaizNumBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRaizNumBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnRaiz.setOnClickListener {
            val numDoub = binding.TfNum.editText?.text.toString()
            if (numDoub.isNotEmpty()){
                val num:Double = numDoub.toDouble()
                val Raiz:Double = sqrt(num)
                binding.TvResultadoR.text = "La Raiz cuadrada es: ${Raiz.toString()}"
            }
            else {
                binding.TvResultadoR.text = "Por Favor ingrese un numero"
            }
        }
    }
}