package com.example.bagusputra.testkotlinku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val angkapertamaaja = findViewById(R.id.angkapertama) as EditText
        val angkakeduaaja = findViewById(R.id.angkakedua) as EditText
        val hitung = findViewById(R.id.hitung) as Button
        val hasil = findViewById(R.id.hasil) as TextView
        val pindah = findViewById(R.id.pindah) as TextView

        pindah.setOnClickListener {
//
            val intent = Intent(this,TestlistviewActivity::class.java)
            startActivity(intent)

        }


        hitung.setOnClickListener {
            val a: String = angkapertamaaja.text.toString()
            val b: String = angkakeduaaja.text.toString()

            val c = a.toInt()
            val d = b.toInt()


            val kali = c * d

            hasil.setText(kali.toString())

            Toast.makeText(applicationContext, kali.toString(), Toast.LENGTH_SHORT).show()
        }

//        val a: String = angkapertamaaja.text.toString()
//        val b: String = angkakeduaaja.text.toString()
//
//        val c = a.toInt()
//        val d = b.toInt()
//
//
//        val kali = c * d
//
//        Toast.makeText(applicationContext,kali,Toast.LENGTH_LONG).show()

    }
}
