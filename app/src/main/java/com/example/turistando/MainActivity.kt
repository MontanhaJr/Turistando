package com.example.turistando

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.turistando.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        bind = ActivityMainBinding.inflate(layoutInflater)
//        val view = bind.root
//        setContentView(view)
        setContentView(R.layout.activity_main)

        val lugar1 = Place(1, "Ponte Hercílio Luz", "Brasil", "https://i1.trekearth.com/photos/939/floripa_ponte.jpg", "123421412", "123124124")
        val lugar2 = Place(2, "Big Ben", "Reino Unido", "https://conteudo.imguol.com.br/c/entretenimento/e7/2021/09/07/big-ben-londres-1631023261553_v2_4x3.jpg", "123421412", "123124124")
        val lugar3 = Place(3, "MASP", "Brasil", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/MASP_Brazil.jpg/1200px-MASP_Brazil.jpg", "123421412", "123124124")

        rv_main.adapter = PlaceAdapter(mutableListOf(lugar1, lugar2, lugar3))
        rv_main.layoutManager = LinearLayoutManager(this)


    }
}