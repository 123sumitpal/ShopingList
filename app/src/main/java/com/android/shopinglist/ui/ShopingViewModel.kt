package com.android.shopinglist.ui

import androidx.lifecycle.ViewModel
import com.android.shopinglist.data.db.entites.ShopingItem
import com.android.shopinglist.data.repository.ShopingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShopingViewModel(
    private val repository: ShopingRepository
) : ViewModel() {
    fun upsert(item: ShopingItem)= CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }
    fun delete(item: ShopingItem)= CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }
    fun getAllShopingItem()=repository.getAllShopingItem()
}