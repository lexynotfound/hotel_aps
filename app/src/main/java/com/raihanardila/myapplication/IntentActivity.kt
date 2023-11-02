package com.raihanardila.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class IntentActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var pindahActivity: Button
    lateinit var pindahData: Button
    lateinit var lakukanTelp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        pindahActivity=findViewById(R.id.pindahactivity)
        pindahData=findViewById(R.id.pindahdata)
        lakukanTelp=findViewById(R.id.lakukantelp)
        pindahActivity.setOnClickListener(this)
        pindahData.setOnClickListener(this)
        lakukanTelp.setOnClickListener(this)
    }

    override fun onClick(view: View?){
        when(view?.id){
            R.id.pindahactivity->{
                //diisi untuk berpindah ke activity lain
                val intent = Intent(this,
                    MainActivity::class.java)
                startActivity(intent)
            }
            R.id.pindahdata->{
                //diisi untuk berpindah ke activity lain
                val intent = Intent(this, HasilActivity::class.java)
                intent.putExtra(HasilActivity.EXTRA_NAMA, "raihanardila")
                intent.putExtra("kelas", "SI2021")
                startActivity(intent)
            }

            R.id.lakukantelp->{
                //diisi untuk berpindah ke activity lain
                val phoneNumber = "081295304698"
                val dialIntent = Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber"))
                startActivity(dialIntent)
            }
        }
    }
}