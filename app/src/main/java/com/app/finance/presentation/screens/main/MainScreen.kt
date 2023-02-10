package com.app.finance.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.app.finance.presentation.navigation.Screens
import com.app.finance.presentation.ui.components.ItemMain
import com.app.finance.presentation.ui.components.MainStatistics
import com.app.finance.presentation.ui.theme.background

@Composable
fun MainScreen(
    navController: NavHostController
) {
    val vm = hiltViewModel<MainViewModel>()
    val history = vm.history.observeAsState(listOf()).value

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