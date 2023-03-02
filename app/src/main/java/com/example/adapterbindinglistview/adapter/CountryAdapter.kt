package com.example.adapterbindinglistview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.adapterbindinglistview.R
import com.example.adapterbindinglistview.databinding.CountryItemBinding
import com.example.adapterbindinglistview.model.country.Country

class CountryAdapter(var countries:MutableList<Country>):RecyclerView.Adapter<CountryAdapter.MyHolder>(){

   inner class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       var countryName:TextView=itemView.findViewById(R.id.country_name)
       var countryArea:TextView=itemView.findViewById(R.id.country_area)
       var countryPopulation:TextView=itemView.findViewById(R.id.country_population)
       var img:ImageView=itemView.findViewById(R.id.img)
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var country:Country=countries[position]

        holder.countryName.text=country.countryName
        holder.countryArea.text=country.area
        holder.countryPopulation.text=country.population
        holder.img.load(country.imgUrl)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}