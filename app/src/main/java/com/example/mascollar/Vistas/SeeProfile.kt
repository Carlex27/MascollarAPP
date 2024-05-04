package com.example.mascollar.Vistas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mascollar.ui.theme.MascollarTheme

class SeeProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MascollarTheme {
                MaquetadoSeeProfile()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MaquetadoSeeProfile() {
    val data = getDatos()
    val observableData = remember {
        mutableStateOf(data)
    }
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        ) {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,

            ){
            Text(text = "Perfil", style = MaterialTheme.typography.titleLarge)
        }
        Column (modifier = Modifier.fillMaxSize().padding(25.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
            ){
            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Text(text = "Nombre:")
                Text(text = "\t" + observableData.value[0])
            }
            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Text(text = "Apellido:")
                Text(text = "\t" + observableData.value[1])
            }
            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Text(text = "Mascota:")
                Text(text = "\t" + observableData.value[2])
            }
            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Text(text = "Edad de la mascota:")
                Text(text = "\t" + observableData.value[3])
            }
            Row (verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Text(text = "Nombre de la mascota:")
                Text(text = "\t" + observableData.value[4])
            }
        }


    }
}

fun getDatos(): List<String> {
    //GAEL AQUI TU VAS A PONER EL CODIGO PARA DEVOLVER LOS DATOS DEL PERFIL DEL USUARIO
    //El ORDEN de los datos del vector es
    //"Nombre", "Apellido", "Mascota", "EdadMascota", "NombreMascota"
    return listOf("Nombre", "Apellido", "Mascota", "EdadMascota", "NombreMascota")
}
