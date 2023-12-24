package com.example.generalstore.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.generalstore.ui.theme.GeneralStoreTheme

@Composable
fun CountryDropDownMenu(
    modifier: Modifier = Modifier,
    items: List<CountryItem>,
    selectedItem: CountryItem? = null,
    onItemSelected: (CountryItem) -> Unit = {},
) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.LightGray),
    ) {
        Row(
            modifier = Modifier
                .clickable {
                    expanded = !expanded
                }
                .padding(vertical = 8.dp, horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = selectedItem?.name ?: "..."
            )
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            items.forEach { country ->
                DropdownMenuItem(
                    text = { Text(country.name) },
                    onClick = {
                        expanded = false
                        onItemSelected(country)
                    }
                )
            }
        }
    }
}

data class CountryItem(
    val id: String,
    val name: String,
)

@Preview
@Composable
fun CountryDropDownMenuPreview() {
    GeneralStoreTheme {
        CountryDropDownMenu(
            items = listOf(),
        )
    }
}

