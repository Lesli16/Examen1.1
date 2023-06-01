package com.example.sumadedosnueros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultado : AppCompatActivity() {

    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

         resultado = findViewById(R.id.txtresultado)

        val result = intent.getIntExtra("resultado", 0  )
        resultado.text = "El resultado es: $result"

    }
}

