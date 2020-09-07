package com.hemendra.recyclerviewcardviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*


class RvAdapter(val context :Context,var data: ArrayList<RVdata>) : RecyclerView.Adapter<RvAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)

        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgview.setImageResource(data[position].img)
        holder.txtview.setText(data[position].txt)
    }
    class ViewHolder(view:View):RecyclerView.ViewHolder(view)
    {
        var txtview = view.item_tv
        var imgview = view.item_iv
    }
}