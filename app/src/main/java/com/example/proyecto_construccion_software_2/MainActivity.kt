package com.example.proyecto_construccion_software_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto_construccion_software_2.navigation.AppNavigation
import com.example.proyecto_construccion_software_2.screens.pantalla1
import com.example.proyecto_construccion_software_2.screens.pantalla2
import com.example.proyecto_construccion_software_2.ui.theme.Proyectoconstruccionsoftware_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyectoconstruccionsoftware_2Theme {
                    AppNavigation()
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Proyectoconstruccionsoftware_2Theme {
        AppNavigation()

    }
}