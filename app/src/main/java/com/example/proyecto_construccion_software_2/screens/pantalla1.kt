package com.example.proyecto_construccion_software_2.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyecto_construccion_software_2.navigation.AppNavigation
import com.example.proyecto_construccion_software_2.navigation.AppScreens
import com.example.proyecto_construccion_software_2.ui.theme.Proyectoconstruccionsoftware_2Theme

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
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp),
                textAlign = TextAlign.Center,
                modifier = Modifier
                        .width(400.dp)
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
                    modifier = Modifier.fillMaxWidth(0.8f),
                    shape = RoundedCornerShape(30.dp)
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
                    shape = RoundedCornerShape(30.dp)
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
                    shape = RoundedCornerShape(30.dp)
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
                    shape = RoundedCornerShape(30.dp)
                    )
                Spacer(modifier = Modifier.padding(20.dp))
                Button(shape = RoundedCornerShape(30.dp),
                    onClick = {
                        navController.navigate(route = "${AppScreens.Pantalla2.route}/${var4.value}")

                    },
                    modifier = Modifier.size(width = 200.dp, height = 50.dp)
                ) {
                    Text(text = "Enviar",style = TextStyle(fontSize = 19.sp),
                    )
                }
            }
        }
    }

}
