package com.android.shopinglist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.shopinglist.data.repository.ShopingRepository

@Suppress("UNCHECKED_CAST")
class ShopingViewModelFactory(
    private val repository: ShopingRepository
):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ShopingViewModel(repository)as T
    }
}