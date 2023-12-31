package com.example.generalstore.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.generalstore.R
import com.example.generalstore.ui.theme.GeneralStoreTheme

@Composable
fun ProductItemCard(
    modifier: Modifier,
    data: ProductsData,
    addToCartClicked: () -> Unit,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                painter = painterResource(id = data.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = data.text
            )
            Row(
                modifier = Modifier.padding(top = 12.dp)
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = data.price,
                    style = TextStyle(
                        color = Color.Green,
                    )
                )
                Text(
                    modifier = Modifier.clickable {
                        addToCartClicked()
                    },
                    text = "ADD TO CART"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItemCardPreview() {
    GeneralStoreTheme {
        Column(
            modifier = Modifier
                .background(color = Color.LightGray)
                .padding(8.dp)
        ) {
            ProductItemCard(
                modifier = Modifier,
                data = ProductsData(
                    imageResourceId = R.drawable.red,
                    text = "Jordan Lift Off",
                    price = "$ 3000.0"
                ),
                addToCartClicked = {},
            )
            Spacer(modifier = Modifier.size(8.dp))
            ProductItemCard(
                modifier = Modifier,
                data = ProductsData(
                    imageResourceId = R.drawable.red,
                    text = "Jordan Lift Off",
                    price = "$ 3000.0"
                ),
                addToCartClicked = {},
            )
        }
    }
}