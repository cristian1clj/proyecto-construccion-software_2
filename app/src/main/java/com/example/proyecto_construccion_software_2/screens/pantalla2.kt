package com.example.proyecto_construccion_software_2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(400.dp)
 //               style = TextStyle(fontWeight = FontWeight.Bold),
                //          fontSize = TextUnit.Companion.Sp(2)
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                nombreVisitante?.let {
                     val var4 : String = nombreVisitante.toString()
                    Text(text = "¿desea recibir a $var4?",
                        style = TextStyle(fontSize = 20.sp))
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(MaterialTheme.colors.background)
                ) {
                    Button(shape = RoundedCornerShape(30.dp),
                        onClick = {
                            val var5 = "rechazado"
                            navController.navigate(route = "${AppScreens.Pantalla3.route}/${var5}")
                        },
                        modifier = Modifier
                            .padding(10.dp)
                            .size(width = 150.dp, height = 50.dp),
                           //background(color = Color(237,125,122)),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(
                            253,233,231
                        )
                        )
                    ) {
                        Text(
                            text = "Rechazar",
                            style = TextStyle(fontSize = 19.sp),
                            color = Color(224,42,3)
                        )
                    }

                    Button(shape = RoundedCornerShape(30.dp),
                        onClick = {
                            val var5 = "aceptado"
                            navController.navigate(route = "${AppScreens.Pantalla3.route}/${var5}")
                        },
                        modifier = Modifier
                            .padding(10.dp)
                            .size(width = 150.dp, height = 50.dp),
                //        .background(color = Color(179,219,176)),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(
                            237,246,234
                        )
                        )
                    ) {
                        Text(
                            text = "Aceptar",
                            style = TextStyle(fontSize = 19.sp),
                            color = Color(75,159,48)
                        )
                    }
                }
            }
        }

    }
}



