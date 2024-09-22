package com.android.shopinglist.data.db.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shoping_item")
data class ShopingItem (
    @ColumnInfo(name = "Item_name")
    var name: String,
    @ColumnInfo(name = "Item_amounnt")
    var amount: Int
){
    @PrimaryKey(autoGenerate = true)
    var id : Int ?=null
}