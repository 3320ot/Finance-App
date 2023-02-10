package com.app.finance.screens.mainDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ItemMainDetailsExpenses() {
    var expenses by rememberSaveable { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, top = 4.dp, end = 16.dp, bottom = 4.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
    ) {
        Column() {
            TextField(
                value = expenses,
                onValueChange = {expenses = it} ,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White
                )
            )
            TextButton(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Категория")
            }
        }
    }
}