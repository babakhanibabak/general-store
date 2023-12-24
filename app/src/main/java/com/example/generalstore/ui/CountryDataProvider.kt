package com.example.generalstore.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class CountryDataProvider {
    @Composable
    fun CountryList(){
        val countries= arrayListOf<String>()
        LazyColumn { items(countries){ CountryItem(name =countries)} }
    }


    @Composable
    fun CountryItem(name: ArrayList<String>) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable {
                    println("Selected country: $name")
                }
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Text(
                text ="Afghanistan",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text ="Albania",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text ="Algeria",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text ="American Samoa",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text ="Andorra",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text ="Angola",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}