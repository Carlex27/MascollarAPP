package com.example.mascollar

import android.os.Bundle
import androidx.compose.ui.Alignment
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mascollar.ui.theme.MascollarTheme

class LoginMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            MascollarTheme {
                MaquetadoGUI(navController)
            }

        }
        enableEdgeToEdge()


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MascollarTheme {
        MaquetadoGUI(navController = rememberNavController())
    }
}


@Composable
fun MaquetadoGUI(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
    ) {
        Image(
            modifier = Modifier.padding(20.dp),
            painter = painterResource(id = R.drawable.iconmain),
            contentDescription = "Logo mascollar"

        )
        Column(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Usuario", color = Color.Black)
            TextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("User1234") },
                modifier = Modifier
                    .padding(16.dp)
            )
            Text(text = "Contraseña", color = Color.Black)
            TextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("*******") },
                modifier = Modifier.padding(16.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Button(
                onClick = { navController.navigate("dbMenu") },
                modifier = Modifier.align(Alignment.CenterHorizontally),
            ) {
                Text("Iniciar Sesión")

            }
        }


    }
}


@Composable
fun SearchBar(modifier: Modifier) {
    TextField(
        value = "", onValueChange = {},
        leadingIcon = {
            Image(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = MaterialTheme.colorScheme.surface,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.surface
        ),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )

}



