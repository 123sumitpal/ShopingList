package com.android.shopinglist.other

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.shopinglist.R
import com.android.shopinglist.data.db.entites.ShopingItem
import com.android.shopinglist.ui.ShopingViewModel

class ShopingitemAdpter(
    var items : List<ShopingItem>,
    private val viewModel: ShopingViewModel
) : RecyclerView.Adapter<ShopingitemAdpter.ShopingViewHolder>(){

    inner class ShopingViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val itemName: TextView= itemView.findViewById(R.id.itemName);
        val itemAmount:TextView=itemView.findViewById(R.id.tvAmount)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoping_item,parent,false)
        return ShopingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ShopingViewHolder, position: Int) {
        val curShopingItem=items[position]

        holder.itemName.text= curShopingItem.name
        holder.itemAmount.text="${curShopingItem.amount}"

    }


}
