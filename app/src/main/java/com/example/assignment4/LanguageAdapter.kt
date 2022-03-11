package com.example.assignment4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_country_list.view.*

class LanguageAdapter(val lstCountry : ArrayList<CountryList>, val context : Context):
    RecyclerView.Adapter<CountryAdapter.CountryVH>() {

    class CountryVH(view : View) : RecyclerView.ViewHolder(view) {
        var countryName = view.countryName
//        var emoji = view.countryEmoji
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.CountryVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_country_list,parent,false)
        return CountryAdapter.CountryVH(view)
    }

    override fun onBindViewHolder(holder: CountryAdapter.CountryVH, position: Int) {
        val country = lstCountry[position]
        holder.countryName.text = country.name
//        holder.emoji.text = country.emoji
    }

    override fun getItemCount(): Int {
        return lstCountry.size
    }


}