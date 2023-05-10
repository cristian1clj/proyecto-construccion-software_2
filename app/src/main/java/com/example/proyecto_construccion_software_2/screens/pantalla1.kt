package com.example.proyecto_construccion_software_2.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyecto_construccion_software_2.R
import com.example.proyecto_construccion_software_2.navigation.AppScreens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun pantalla1(navController: NavController) {
    val focusRequester = remember { FocusRequester() }
    val var1 = remember {
        mutableStateOf("")
    }
    val var2 = remember {
        mutableStateOf("")
    }
    val var3 = remember {
        mutableStateOf("")
    }
    val var4 = remember {
        mutableStateOf("")
    }
    val var5 = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(10.dp)
        ) {
            Text(
                text = "Autorizacion entrada de vehiculo",
                style = TextStyle(fontWeight = FontWeight.Bold),
      //          fontSize = TextUnit.Companion.Sp(2)
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                OutlinedTextField(
                    value = var1.value,
                    onValueChange = { var1.value = it },
                    label = { Text(text = "Matricula") },
                    placeholder = { Text(text = "Matricula") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )
                OutlinedTextField(
                    value = var2.value,
                    onValueChange = { var2.value = it },
                    label = { Text("Apartamento") },
                    placeholder = { Text(text = "Numero de partamento") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .focusRequester(focusRequester = focusRequester),
                )
                OutlinedTextField(
                    value = var3.value,
                    onValueChange = { var3.value = it },
                    label = { Text("Telefono") },
                    placeholder = { Text(text = "Numero de telefono") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .focusRequester(focusRequester = focusRequester),
                    )
                OutlinedTextField(
                    value = var4.value,
                    onValueChange = { var4.value = it },
                    label = { Text("Nombre") },
                    placeholder = { Text(text = "Nombre del visitante") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .focusRequester(focusRequester = focusRequester),
                    )
                Spacer(modifier = Modifier.padding(10.dp))
                Button(
                    onClick = {
                        navController.navigate(route = "${AppScreens.Pantalla2.route}/${var4.value}")
                    },
                ) {
                    Text(text = "Enviar")
                }
            }
        }
    }

}
