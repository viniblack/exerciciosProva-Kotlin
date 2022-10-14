package com.example.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ex03.*


class ex03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex03)

        val genero = arrayListOf("Escolha um genero", "Ação", "Aventura", "Terror" );
        val plataforma = arrayListOf("Escolha uma plataforma", "console", "PC", "Urna" ,"Torradeira" );

        val adapterGenero = ArrayAdapter(this, android.R.layout.simple_spinner_item, genero)
        adapterGenero.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGenero.adapter = adapterGenero

        val adapterPlataforma = ArrayAdapter(this, android.R.layout.simple_spinner_item, plataforma)
        adapterPlataforma.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPlataforma.adapter = adapterPlataforma


        button.setOnClickListener {
            showText("O nome do jogo é ${plainText.text}, a plataforma é ${spinnerPlataforma.selectedItem}, e o gênero é ${spinnerGenero.selectedItem}")
        }



    }

    fun showText(msg: String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("Close", null)
            .create()
            .show()
    }

}