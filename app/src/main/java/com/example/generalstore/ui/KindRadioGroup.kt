package com.example.generalstore.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role

@Composable
fun KindRadioGroup(
    items: List<String>,
    selected: String,
    setSelected: (selected: String) -> Unit
) {


    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        items.forEach { item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =Modifier.selectable(
                    selected = (item == selected),
                    onClick = { setSelected(item) },
                    role = Role.RadioButton
                )
            ) {
                RadioButton(selected = selected == item,
                    onClick = { setSelected(item) }, enabled = true
                )
                Text(text = item, modifier = Modifier)

            }
        }
    }
}


@Composable
fun KindRadioGroupUsage() {
    val radioKinds = listOf("Male", "Female")
    val (selected, setSelected) = remember { mutableStateOf("") }
    Column(modifier = Modifier.selectableGroup()) {
        KindRadioGroup(
            items = radioKinds,
            selected, setSelected
        )
    }
}