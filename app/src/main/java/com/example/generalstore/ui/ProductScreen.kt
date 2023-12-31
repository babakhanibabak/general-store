package com.example.generalstore.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.generalstore.R
import com.example.generalstore.ui.theme.GeneralStoreTheme
import androidx.compose.ui.tooling.preview.Preview as Preview1

@Composable
fun ProductScreen(
    modifier: Modifier,
    productsList: List <ProductsData>
                  ) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Gray)
    ) {
        val state= rememberScrollState()
        LaunchedEffect(Unit) { state.animateScrollTo(100) }
        LazyColumn(
            modifier = Modifier
                .background(Color.LightGray)
                .padding(16.dp)
                .fillMaxSize()
                .verticalScroll(state)
        ) {
            products()



    }
}

@Preview1
@Composable
fun ProductScreenPreview() {
    GeneralStoreTheme {
        ProductScreen (modifier = Modifier, productsList =listOf(
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
        ))
    }
}}