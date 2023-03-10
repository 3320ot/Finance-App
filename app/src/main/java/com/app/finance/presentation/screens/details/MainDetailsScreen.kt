package com.app.finance.presentation.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.app.finance.presentation.navigation.Screens
import com.app.finance.presentation.ui.components.ItemMainDetailsExpenses
import com.app.finance.presentation.ui.components.ItemMainDetailsIncome
import com.app.finance.presentation.ui.theme.background

@Composable
fun MainDetailsScreen(
    navController: NavHostController,
    id: String?
) {
    val vm = hiltViewModel<DetailsViewModel>()
    val history = vm.history.observeAsState(listOf()).value
    val transaction = vm.transaction.observeAsState().value

    id?.toLong()?.let { vm.getTransaction(id = it) }

    Scaffold {
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
                    text = "3 ????????????",
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
                        text = "????????????",
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
                        text = "??????????????",
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
