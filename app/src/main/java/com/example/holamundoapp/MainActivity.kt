package com.example.holamundoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.holamundoapp.ui.theme.HolaMundoAppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.holamundoapp.ui.UserViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyScreen(viewModel: UserViewModel = viewModel(), modifier: Modifier = Modifier) {
    val user = viewModel.getUser()
    val edad = viewModel.getEdad()

    Text(text = "Hola, ${user.name}. Edad: $edad", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    HolaMundoAppTheme {
        MyScreen()
    }
}