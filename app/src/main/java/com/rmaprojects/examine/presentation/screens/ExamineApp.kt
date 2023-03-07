package com.rmaprojects.examine.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ExamineApp(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ""
    ) {
        composable("") {

        }
    }
}