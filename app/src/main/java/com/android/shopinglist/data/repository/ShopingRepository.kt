package com.android.shopinglist.data.repository

import com.android.shopinglist.data.db.ShopingDatabase
import com.android.shopinglist.data.db.entites.ShopingItem

class ShopingRepository (
    private val db : ShopingDatabase
){
    suspend fun upsert(item: ShopingItem)=db.getShopingDao().upsert(item)

    suspend fun delete(item: ShopingItem)=db.getShopingDao().delete(item)

    fun getAllShopingItem()= db.getShopingDao().getAllShopingItem()
}