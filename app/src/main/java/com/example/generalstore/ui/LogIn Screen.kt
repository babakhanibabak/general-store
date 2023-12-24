package com.example.generalstore.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.generalstore.R

@Composable
fun LogInScreen(
    modifier: Modifier = Modifier,
    countryList: PaddingValues,
    onCountryClick: (CountryDataProvider) -> Unit = {}

) {
    val iconRes = painterResource(id = R.drawable.baseline_adjust_24)
    val iconRes2 = painterResource(id = R.drawable.outline_circle_24)
    val image1 = painterResource(id = R.drawable.firstphoto)
    Image(
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth(),
        painter = image1,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp)
            .clip(MaterialTheme.shapes.small),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier.padding(50.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "Select the country where you want to shop")
            Spacer(modifier = Modifier.size(25.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                MyButton(
                    text = "list of country", onClick = { onCountryClick },
                    colors = Color.Green
                )

            }
            Spacer(modifier = Modifier.size(25.dp))
            Text(
                modifier = Modifier.wrapContentWidth(Alignment.Start),
                textAlign = TextAlign.Start,
                text = "Your name",
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.size(25.dp))
            OutlinedTextField(color = Color.Green) {

            }
            Spacer(modifier = Modifier.size(25.dp))
            Text(text = "Gender", style = MaterialTheme.typography.titleSmall)
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
            MyButton(text = "Let's Shop", onClick = { }, colors = Color.Green)

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField(color: Color, content: () -> Unit) {
    Box {
        // This box works as background
        Box(
            modifier = Modifier
                .matchParentSize()
                .padding(top = 8.dp) // adding some space to the label
                .background(
                    color,
                    // rounded corner to match with the OutlinedTextField
                    shape = RoundedCornerShape(4.dp)
                )
        )
        // OutlineTextField will be the content...
        content()
    }
}