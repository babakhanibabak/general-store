package com.example.generalstore.ui

import androidx.annotation.DrawableRes
import com.example.generalstore.R

data class ProductsData(
 @DrawableRes val imageResourceId: Int,
    val text: String,
)


    fun products() {
        listOf(
            ProductsData(R.drawable.blue, text = "LeBron Soldier 12"),
            ProductsData(R.drawable.black, text = "Air Jordan 1 Mid Se"),
            ProductsData(R.drawable.jordan, text = "Air Jordan 4 Retro"),
            ProductsData(R.drawable.nike, text = "Nike Blazer Mid 77"),
            ProductsData(R.drawable.pggggg, text = "PG 3"),
            ProductsData(R.drawable.red, text = "Jordan Lift Of"),
            ProductsData(R.drawable.sefid, text = " Jordan 6 Rings"),
            ProductsData(R.drawable.star, text = "Converse All Star"),
            ProductsData(R.drawable.fila, text = "Air Jordan 9 Retro"),
            ProductsData(R.drawable.boots, text = "Nike SFB Jungle"),
        )
    }

