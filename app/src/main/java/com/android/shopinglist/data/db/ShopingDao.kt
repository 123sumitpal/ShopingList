package com.android.shopinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.shopinglist.data.db.entites.ShopingItem

@Dao
interface ShopingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShopingItem)

    @Delete
    suspend fun delete(item: ShopingItem)

    @Query("SELECT *FROM SHOPING_ITEM")
    fun getAllShopingItem():LiveData<List<ShopingItem>>
}