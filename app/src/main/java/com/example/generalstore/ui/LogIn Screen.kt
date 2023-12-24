package com.example.generalstore.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.generalstore.R
import com.example.generalstore.ui.theme.GeneralStoreTheme
import androidx.compose.material3.OutlinedTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogInScreen(
    modifier: Modifier = Modifier,
) {
    val iconRes = painterResource(id = R.drawable.baseline_adjust_24)
    val iconRes2 = painterResource(id = R.drawable.outline_circle_24)
    val image1 = painterResource(id = R.drawable.firstphoto)

    var selectedCountry by remember { mutableStateOf<CountryItem?>(null) }
    var name by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {
        Image(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            painter = image1,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
        )
        Column(
            modifier = modifier
                .padding(top = 80.dp, start = 24.dp, end = 24.dp)
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                .border(
                    width = 1.dp,
                    color = Color.LightGray.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(8.dp),
                )
                .padding(all = 24.dp),
        ) {
            InfoText(text = "Select the country where you want to shop")
            Spacer(modifier = Modifier.size(8.dp))
            CountryDropDownMenu(
                items = CountryDataProvider.provideCountries(),
                selectedItem = selectedCountry,
                onItemSelected = {
                    selectedCountry = it
                }
            )
            Spacer(modifier = Modifier.size(32.dp))
            InfoText(text = "Your name")
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                value = name,
                onValueChange = { newValue ->
                    name = newValue
                }
            )
            Spacer(modifier = Modifier.size(32.dp))
            InfoText(text = "Gender")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = iconRes,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Black)
                )
                Text(text = "Male", style = MaterialTheme.typography.bodyLarge)
            }
            Spacer(modifier = Modifier.size(15.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = iconRes2,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Black)
                )
                Text(text = "Female", style = MaterialTheme.typography.bodyLarge)
            }
            Spacer(modifier = Modifier.size(25.dp))
            MyButton(text = "Let's Shop", onClick = { })

        }
    }
}

@Composable
private fun InfoText(
    modifier: Modifier = Modifier,
    text: String,
) {
    Text(
        modifier = modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
        ),
        color = Color.Gray,
    )
}

@Preview
@Composable
fun LogInScreenPreview() {
    GeneralStoreTheme {
        LogInScreen()
    }
}