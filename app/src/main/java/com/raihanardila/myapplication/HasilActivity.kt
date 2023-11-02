package com.raihanardila.myapplication

import androidx.appcompat.app.AppCompatActivity

class HasilActivity : AppCompatActivity{
    companion object{
        const val EXTRA_NAMA = "raihanardila"
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        val dataNama = intent.getStringExtra(EXTRA_NAMA)
        val dataKelas = intent.getStringExtra("kelas")

        if (dataNama != null){
            val textView  =findViewById<TextView>(R.id.text1)
            textView.text = "Received Data: $dataNama"
        }
        if (dataKelas != null){
            val textView = findViewById<TextView>(R.id.text2)
            textView.text = "Received Data: $dataKelas "
        }
    }
}