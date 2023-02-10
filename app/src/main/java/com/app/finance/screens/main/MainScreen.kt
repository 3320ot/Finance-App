package com.app.finance.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.app.finance.navigation.Screens
import com.app.finance.ui.theme.*

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .background(background)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box() {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, top = 24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Text(
                            text = "Январь",
                            fontWeight = FontWeight.Light,
                            fontSize = 36.sp,
                        )
                            Icon(
                                imageVector = Icons.Filled.ArrowDropDown,
                                contentDescription = "more",
                                modifier = Modifier
                                    .height(35.dp)
                                    .width(35.dp)
                            )
                        }
                    }
                }
            }
            MainStatistics()
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 28.dp)
                ) {
                    ItemMain(
                        modifier = Modifier
                        .clickable { navController.navigate(Screens.MainDetailsScreen.rout) }
                    )
                    ItemMain(
                        modifier = Modifier
                            .clickable { navController.navigate(Screens.MainDetailsScreen.rout) }
                    )
                    ItemMain(
                        modifier = Modifier
                            .clickable { navController.navigate(Screens.MainDetailsScreen.rout) }
                    )
                }
        }

    }
}