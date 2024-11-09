package com.sabran.appsekolah.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.appsekolah.DetailSekolahMapsActivity
import com.sabran.appsekolah.Model.ModelSekolah
import com.sabran.appsekolah.R

class AdapterSekolah(
    val listItemSekolah : List<ModelSekolah>
) : RecyclerView.Adapter<AdapterSekolah.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgSekolah: ImageView = itemView.findViewById(R.id.imgSekolah)
        val tvNamaTempatSekolah: TextView = itemView.findViewById(R.id.tvNamaTempatSekolah)
        val tlpSekolah: TextView = itemView.findViewById(R.id.tlpSekolah)
        val cardSekolah: CardView = itemView.findViewById(R.id.cardSekolah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterSekolah.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_sekolah,parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: AdapterSekolah.MyViewHolder, position: Int) {
        val currentItem = listItemSekolah[position]
        holder.imgSekolah.setImageResource(currentItem.gambarSekolah)
        holder.tvNamaTempatSekolah.text = currentItem.namaLokasiSekolah
        holder.tlpSekolah.text = currentItem.tlpSekolah
        //event click pada card view
        holder.cardSekolah.setOnClickListener {
            val intentDetailSekolah = Intent(holder.itemView.context, DetailSekolahMapsActivity::class.java)
            //kirim data list item wisata ke DetailWisataMapsActivity
            intentDetailSekolah.putExtra("namaLokasiSekolah", currentItem.namaLokasiSekolah)
            intentDetailSekolah.putExtra("gambarSekolah", currentItem.gambarSekolah)
            intentDetailSekolah.putExtra("tlpSekolah", currentItem.tlpSekolah)
            intentDetailSekolah.putExtra("deskripsiSekolah", currentItem.deskripsiSekolah)
            intentDetailSekolah.putExtra("latSekolah", currentItem.latSekolah)
            intentDetailSekolah.putExtra("longSekolah", currentItem.longSekolah)
            //menjalankan intent startActivity
            holder.itemView.context.startActivity(intentDetailSekolah)

        }
    }

    override fun getItemCount(): Int {
        return listItemSekolah.size
    }

}