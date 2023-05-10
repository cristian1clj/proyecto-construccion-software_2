package com.example.proyecto_construccion_software_2.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun pantalla3(navController: NavController, confirmacion: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(10.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                confirmacion?.let {
                    val var5: String = confirmacion.toString()
                    Text(text = "el copropietario ha $var5 la entrada del visitante ",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 25.sp),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(400.dp))
                }
            }
        }
    }
}
