package com.app.finance.screens.mainDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.finance.navigation.Screens
import com.app.finance.ui.theme.background

@Composable
fun MainDetailsScreen(navController: NavHostController) {
    var income by rememberSaveable { mutableStateOf("") }
    var expenses by rememberSaveable { mutableStateOf("") }
    Scaffold() {
        Column(modifier = Modifier.background(background)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
            ) { Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .height(48.dp)
                        .width(48.dp)
                        .clickable { navController.navigate(Screens.MainScreen.rout) }
                ) {
                    Icon(imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "back",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .height(28.dp)
                            .width(28.dp)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 16.dp)
                    ,
                    text = "3 января",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Light
                )
                }
            }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .padding(it)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier,
                        text = "Доходы",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Light
                    )
                }
                ItemMainDetailsIncome()
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier,
                        text = "Расходы",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Light
                    )
                }

                ItemMainDetailsExpenses()
                ItemMainDetailsExpenses()
                ItemMainDetailsExpenses()
            }
        }
    }
        }
    }
