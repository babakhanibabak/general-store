package com.example.generalstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.generalstore.ui.ProductScreen
import com.example.generalstore.ui.products
import com.example.generalstore.ui.theme.GeneralStoreTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeneralStoreTheme {
                ProductScreen(
                    modifier = Modifier.fillMaxSize(),
                    productsList = products()
                )
            }
        }
    }
}
