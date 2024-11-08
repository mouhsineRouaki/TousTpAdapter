package com.example.adaptertp3

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.affichage)

        val data = listOf(
            hashMapOf("nom" to "France", "monnaie" to "Euro", "codeiso" to "FR"),
            hashMapOf("nom" to "États-Unis", "monnaie" to "Dollar", "codeiso" to "US"),
            hashMapOf("nom" to "Japon", "monnaie" to "Yen", "codeiso" to "JP"),
            hashMapOf("nom" to "France", "monnaie" to "Euro", "codeiso" to "FR"),
            hashMapOf("nom" to "États-Unis", "monnaie" to "Dollar", "codeiso" to "US"),
            hashMapOf("nom" to "Japon", "monnaie" to "Yen", "codeiso" to "JP"),
            hashMapOf("nom" to "France", "monnaie" to "Euro", "codeiso" to "FR"),
            hashMapOf("nom" to "États-Unis", "monnaie" to "Dollar", "codeiso" to "US"),
            hashMapOf("nom" to "Japon", "monnaie" to "Yen", "codeiso" to "JP")
        )

        val element = arrayOf("nom", "monnaie", "codeiso")
        val placement = intArrayOf(R.id.codep, R.id.mo, R.id.codeiso)

        val adapter = SimpleAdapter(this, data, R.layout.item_layout, element, placement)
        lv.adapter = adapter
    }
}
