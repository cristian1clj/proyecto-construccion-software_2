package com.example.proyecto_construccion_software_2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyecto_construccion_software_2.screens.pantalla1
import com.example.proyecto_construccion_software_2.screens.pantalla2

@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Pantalla1.route){
        composable(route = AppScreens.Pantalla1.route){
            pantalla1(navController)
        }
        composable(route = AppScreens.Pantalla2.route) {
            pantalla2(navController)
        }
    }
}