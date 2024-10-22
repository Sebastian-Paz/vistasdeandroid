package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.myapplication.screens.Busqueda1
import com.example.myapplication.screens.Busquedafil
import com.example.myapplication.screens.Contactanos
import com.example.myapplication.screens.Olvidar1
import com.example.myapplication.screens.Olvidar2
import com.example.myapplication.screens.Olvidar3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Column {

        Olvidar3()
    }
}
