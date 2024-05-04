package com.example.mascollar.Vistas

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mascollar.ui.theme.MascollarTheme
import com.google.android.material.datepicker.MaterialDatePicker
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

class CreateRemainder : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MascollarTheme {
                MaquetadoCreateRemainder()
            }
        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun MaquetadoCreateRemainder() {

    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        ){
        Text(text = "Crear recordatorio")

        Column (modifier = Modifier.fillMaxWidth().padding(25.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),

            ){
            Text(text = "Nombre del recordatorio:")
            TextField(value = "", onValueChange = {})

            Text(text = "Fecha del recordatorio:")
            //AQUI VA UN BOTON QUE TE PERMITA SELECCIONAR LA FECHA
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Seleccionar fecha")
            }
            //UN BOTON QUE TE PERMITA SELECCIONAR LA HORA
            Text(text = "Hora del recordatorio:")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Seleccionar hora")
            }
            Text(text = "Nombre mascota:")
            TextField(value = "", onValueChange = {})

        }
    }

}

