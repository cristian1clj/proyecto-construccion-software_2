package com.example.proyecto_construccion_software_2.navigation

sealed class AppScreens(
    val route : String
    ){
        object Pantalla1 : AppScreens( "pantalla_1")
        object Pantalla2 : AppScreens( "pantalla_2")
        object Pantalla3 : AppScreens("pantalla_3")
}

