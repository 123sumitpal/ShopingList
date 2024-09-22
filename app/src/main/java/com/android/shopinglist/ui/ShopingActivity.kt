package com.android.shopinglist.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.android.shopinglist.R
import com.android.shopinglist.data.db.ShopingDatabase
import com.android.shopinglist.data.repository.ShopingRepository

class ShopingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shoping)

        val database = ShopingDatabase(this)
        val repository = ShopingRepository(database)
        val factory =ShopingViewModelFactory(repository )
        val viewModel =ViewModelProviders.of(this,factory).get(ShopingViewModel::class.java)
        
    }
}