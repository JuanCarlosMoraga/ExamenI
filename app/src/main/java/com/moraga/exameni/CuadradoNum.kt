package com.moraga.exameni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.moraga.exameni.databinding.FragmentCuadradoNumBinding


class CuadradoNum : Fragment() {
    lateinit var binding : FragmentCuadradoNumBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCuadradoNumBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    public fun start(){
        binding.BtnCuadrado.setOnClickListener {
            val numStr = binding.TfNum.editText?.text.toString()
            if (numStr.isNotEmpty()){
                val num:Int = numStr.toInt()
                val cuadrado:Int = (num * num)
                binding.TvResultadoC.text = "El cuadrado es: ${cuadrado.toString()}"
            }else{
            binding.TvResultadoC.text = "Por Favor ingrese un numero"}
        }
    }
}
