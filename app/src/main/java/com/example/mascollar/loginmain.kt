package com.example.mascollar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mascollar.ui.theme.MascollarTheme

class loginmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginmain)

        // Obtén la referencia al botón
        val button = findViewById<Button>(R.id.buttonLogin)

        // Establece el listener
        button.setOnClickListener {
            // Crea el Intent
            val intent = Intent(this, dbMenu::class.java)
            // Inicia la actividad
            startActivity(intent)
        }
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MascollarTheme {

    }
}