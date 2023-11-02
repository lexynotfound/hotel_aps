package com.raihanardila.myapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raihanardila.myapplication.R
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.raihanardila.myapplication.fragment.FragmentHome

class FragmentActivity : AppCompatActivity {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val fm: FragmentManager = supportFragmentManager
        val home = FragmentHome()
        val fragment: Fragment? = fm.findFragmentByTag(
            FragmentHome::class.java.simpleName
        )
        if (fragment !is FragmentHome){
            fm.beginTransaction()
                .add(R.id.frame_container2,home,
                    FragmentHome::class.java.simpleName)
                .commit()
        }
    }

}