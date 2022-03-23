package com.example.turistando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.example.turistando.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        val view = bind.root
        setContentView(view)

        var cont = 0
        bind.txtHello.text = "teste"
        bind.txtHello.run {
            setOnClickListener {
                text = cont.toString()
                if (cont > 20) textSize = cont.toFloat()
                cont++
            }
        }

    }
}