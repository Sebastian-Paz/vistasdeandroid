package com.example.myapplication.screens

import com.example.myapplication.ui.theme.MyApplicationTheme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

/**
 * Created by codia-figma
 */
@Composable
fun Olvidar3() {
    // Box-1141:154-olvidadar contraseña
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .fillMaxSize() // Cambia a fillMaxSize para llenar el espacio disponible
            .verticalScroll(rememberScrollState()) // Habilitar scroll vertical
            .clipToBounds(),
    ) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.fondoolvidar),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -5.dp, y = -6.dp)
                .size(435.dp, 722.dp), // Ajusta el tamaño si es necesario
        )

        // Segunda caja
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 503.dp)
                .background(Color(0xfff5f5f3), RoundedCornerShape(20.dp))
                .background(Color(0xfff5f5f3), RoundedCornerShape(20.dp))
                .size(900.dp, 1000.dp), // Ajustar tamaño del cuadro
        )



        // Text-1141:157-Ingrese su telefono
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 98.dp, y = 556.dp)
                .width(373.dp),
            text = "Ingrese su telefono",
            color = Color(0xff000000),
            fontSize = 25.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-1141:158-image 178
        Image(
            painter = painterResource(id = R.drawable.sinfondo),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 42.dp)
                .size(216.dp, 89.dp),
        )
        // Empty-1141:159-Rectangle 717
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 861.dp)
                .background(Color(0xff38352e), RoundedCornerShape(10.dp))
                .size(334.dp, 43.dp),
        )
        // Text-1141:160-Siguiente
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 159.dp, y = 872.dp)
                .size(111.dp, 20.dp),
            text = "Siguiente",
            color = Color(0xfff9f7f3),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-1141:162-Rectangle 721
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 769.dp)
                .background(Color(0xfffcfcfc), RoundedCornerShape(20.dp))
                .size(342.dp, 54.dp)
                .border(1.dp, Color(0xff000000), RoundedCornerShape(20.dp)),
        )
        // Empty-1141:163-Line 5
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 39.dp, y = 661.dp)
                .size(348.dp, 1.dp)
                .border(1.dp, Color(0xffcec7c7)),
        )
        // Empty-1141:164-Line 7
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 226.dp, y = 661.dp)
                .size(161.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Text-1141:165-Telefono
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 251.dp, y = 612.dp),
            text = "Telefono",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1141:166-Correo
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 93.dp, y = 612.dp),
            text = "Correo",
            color = Color(0xb2000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-1141:167-Line 10
        Image(
            painter = painterResource(id = R.drawable.banderacolombia),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 98.dp, y = 727.dp)
                .size(1.dp, 33.dp)
                .border(1.dp, Color(0x4c000000)),
        )
        // Image-1141:168-image 401
        Image(
            painter = painterResource(id = R.drawable.banderacolombia),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 52.dp, y = 784.dp)
                .size(37.dp, 26.dp),
        )
        // Text-1141:169-+57
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 112.dp, y = 783.dp),
            text = "+57",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1141:220-Ingrese su numero para poder enviar un codigo de confirmacion
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 43.dp, y = 684.dp)
                .size(341.dp, 50.dp),
            text = "Ingrese su numero para poder enviar un codigo de confirmacion",
            color = Color(0xb2000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Telefono() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
               Telefono ()
            }
        }
    }
}
