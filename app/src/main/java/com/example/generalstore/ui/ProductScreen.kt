package com.example.generalstore.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.generalstore.ui.theme.GeneralStoreTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductScreen(
    modifier: Modifier,
    productsList: List<ProductsData>
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Products") },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Green)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(padding)
                .background(color = Color.LightGray),
            contentPadding = PaddingValues(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(productsList) {
                ProductItemCard(
                    modifier = Modifier,
                    data = it,
                    addToCartClicked = {},
                )
            }
        }
    }
}

@Preview
@Composable
fun ProductScreenPreview() {
    GeneralStoreTheme {
        ProductScreen(
            modifier = Modifier,
            productsList = products(),
        )
    }
}