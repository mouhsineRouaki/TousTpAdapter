package com.example.adaptertp4

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.lv)
        val data = listOf(
            hashMapOf("pays" to "palastine","capitale" to "Qods","coutinent" to "Asie"),
            hashMapOf("pays" to "albanie","capitale" to "Tirana","coutinent" to "Europe"),
            hashMapOf("pays" to "algerie","capitale" to "alger","coutinent" to "Afrique"),
            hashMapOf("pays" to "andorre","capitale" to "kaboul","coutinent" to "Asie"),
            hashMapOf("pays" to "angola","capitale" to "luanda","coutinent" to "Europe"),
            hashMapOf("pays" to "argentine","capitale" to "Buenos aires","coutinent" to "Afrique")
        )
        val element = arrayOf("pays","capitale","coutinent")
        val emplacement= intArrayOf(R.id.NomP,R.id.NomCap,R.id.Coutinent)
        val adapter = SimpleAdapter(this,data,R.layout.item_layout,element,emplacement)
        lv.adapter = adapter

    }
}