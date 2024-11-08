package com.example.adaptertp5.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.adaptertp5.R

class Myadapter(val context: Context,val list :List<HashMap<String,String>>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
       return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1?: LayoutInflater.from(context).inflate(R.layout.item_layout,p2,false)
        val nom = view.findViewById<TextView>(R.id.nom)
        val prenom = view.findViewById<TextView>(R.id.prenom)
        val age = view.findViewById<TextView>(R.id.age)
        val persone = getItem(p0) as HashMap<String,String>
        val ageText = persone["age"].toString().toInt()
        val nomText = persone["nom"]
        val prenomText = persone["prenom"]

        nom.text = nomText
        prenom.text = prenomText
        age.text = ageText.toString()
        if(ageText <18){
            nom.setTextColor(Color.GREEN)
        } else {
            nom.setTextColor(Color.BLUE)
        }
        return view
    }
}