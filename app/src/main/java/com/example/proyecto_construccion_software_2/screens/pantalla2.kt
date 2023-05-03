package com.example.proyecto_construccion_software_2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyecto_construccion_software_2.navigation.AppScreens

@Composable
fun pantalla2(navController: NavController, nombreVisitante: String?) {
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
            Text(
                text = "Solicitud entrada de vehiculo",
                style = TextStyle(fontWeight = FontWeight.Bold),
                //          fontSize = TextUnit.Companion.Sp(2)
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                nombreVisitante?.let {
                    //                    val var4 =
                    Text(text = "desea recibir a $it ?")
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(MaterialTheme.colors.background)
                ) {
                    Button(
                        onClick = {
                            // go to the 3th page
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                    ) {
                        Text(text = "Rechazar")
                    }

                    Button(
                        onClick = {
                            // go to the 3th page
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                    ) {
                        Text(text = "Aceptar")
                    }
                }
            }
        }

    }
}
