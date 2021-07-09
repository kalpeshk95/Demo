package com.example.demo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ListItemBinding


open class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    private val list: MutableList<DataList> = mutableListOf()

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    fun setItems(listItems: List<DataList>) {
        list.clear()
        list.addAll(listItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (list[position].header) {
            holder.binding.label.setBackgroundColor(Color.GREEN)
        }
        holder.binding.label.text = list[position].label
    }
}