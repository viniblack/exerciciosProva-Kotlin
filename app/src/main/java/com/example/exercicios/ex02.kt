package com.example.exercicios

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.exercicios.databinding.ActivityEx02Binding

class ex02 : AppCompatActivity() {

    lateinit var binding : ActivityEx02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEx02Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val cores = arrayListOf("Escolha uma cor", "Vermelho", "Preto", "Azul" );

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cores)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, spinner: View?, posicao: Int, id: Long) {

                when (posicao){
                    1 -> {
                        binding.root.setBackgroundColor(Color.RED)
                    }

                    2 ->{
                        binding.root.setBackgroundColor(Color.BLACK)
                    }

                    3 ->{
                        binding.root.setBackgroundColor(Color.BLUE)
                    }

                    else ->{
                        binding.root.setBackgroundColor(Color.WHITE)
                    }

                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

    }
}