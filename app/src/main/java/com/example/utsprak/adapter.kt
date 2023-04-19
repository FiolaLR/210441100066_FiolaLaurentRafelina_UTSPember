package com.example.utsprak

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class adapter (private val Datadata: ArrayList<classdata>, private val context: Context): RecyclerView.Adapter<adapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.datanama,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: adapter.CourseViewHolder, position: Int) {
        holder.nama.text = Datadata.get(position).Nama
        holder.umur.text = Datadata.get(position).umur
        holder.univ.text = Datadata.get(position).univ
        holder.foto.setImageResource(Datadata.get(position).foto)
    }
    override fun getItemCount(): Int {
        return Datadata.size
    }
    class CourseViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val umur: TextView = itemView.findViewById(R.id.idumur)
        val univ: TextView = itemView.findViewById(R.id.iduniv)

    }
}

