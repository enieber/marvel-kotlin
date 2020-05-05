package com.enieber.marvel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.caracter_item.view.*

class CaractersListAdapter(private val caracters: List<Caracter>,
                           private val context: Context) : Adapter<CaractersListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.caracter_item, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return caracters.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val caracter = caracters[position]
        holder.name.text = caracter.name
        holder.description.text = caracter.description
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.caracter_item_name
        val description = itemView.caracter_item_description
    }
}
