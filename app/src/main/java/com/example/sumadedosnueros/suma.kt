package com.example.sumadedosnueros

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


     class suma : AppCompatActivity() {
         lateinit var numero1: EditText
         lateinit var numero2: EditText
         lateinit var btnsumar: Button




         @SuppressLint("MissingInflatedId")
         override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)
             setContentView(R.layout.activity_suma)

                 numero1 = findViewById(R.id.n1)
                 numero2 = findViewById(R.id.n2)
                 btnsumar = findViewById(R.id.btn_suma)


                 btnsumar.setOnClickListener(View.OnClickListener {
                    val num1 = Integer.parseInt(numero1.text.toString())
                     val num2 = Integer.parseInt(numero2.text.toString())
                     val sum = num1 + num2


                     val intent = Intent(this,resultado::class.java)
                     intent.putExtra("resultado", sum)
                     startActivity(intent)
                 })





         }
     }

