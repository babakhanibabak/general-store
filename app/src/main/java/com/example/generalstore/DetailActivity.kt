package com.example.generalstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.generalstore.ui.ProductScreen
import com.example.generalstore.ui.ProductsData
import com.example.generalstore.ui.products
import com.example.generalstore.ui.theme.GeneralStoreTheme

class DetailActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeneralStoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
Scaffold(topBar = { TopAppBar(title = {"Products" },
    colors =TopAppBarDefaults.
    smallTopAppBarColors(containerColor = Color.Green) )}) {
padding->
    ProductScreen( modifier= Modifier.padding(padding),
        productsList = )
}
}
                }
            }
        }
    }

@Preview
@Composable
fun DetailActivityPreview(){
    GeneralStoreTheme{
        ProductScreen(modifier = Modifier, )
    }
}
