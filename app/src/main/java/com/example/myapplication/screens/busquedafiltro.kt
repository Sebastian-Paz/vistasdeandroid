package com.example.myapplication.screens

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
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * Created by codia-figma
 */
@Composable
fun Busquedafil() {
    // Box-1088:527-Busqueda por categoria 2
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffd9d9d9))
            .size(500.dp, 1000.dp)
            .verticalScroll(rememberScrollState()) // Habilitar scroll vertical
            .clipToBounds(),
    ) {
        // Empty-1088:528-Rectangle 761
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = -101.dp)
                .background(Color(0xffd9d9d9))
                .size(500.dp, 3000.dp),
        )
        // Image-1088:529-image 190
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 503.dp, y = 308.dp)
                .size(36.dp, 33.dp),
        )
        // Image-1088:530-588a6507d06f6719692a2d15 3
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 19.dp, y = 28.dp)
                .size(35.dp, 24.dp),
        )
        // Image-1088:248-Rectangle 687
        Image(
            painter = painterResource(id = R.drawable.vehiculos),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 757.dp)
                .size(33.dp, 30.dp),
        )
        // Text-1088:249-Idumentaria
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 385.dp)
                .size(173.dp, 26.dp),
            text = "Idumentaria",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:250-Instrumentos musicales
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 433.dp)
                .size(193.dp, 26.dp),
            text = "Instrumentos musicales",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:251-Productos para mascotas
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 479.dp)
                .size(198.dp, 26.dp),
            text = "Productos para mascotas",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:252-Suministros de oficia
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 527.dp)
                .size(172.dp, 26.dp),
            text = "Suministros de oficia",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:253-Artesanias
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 573.dp)
                .size(172.dp, 26.dp),
            text = "Artesanias",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:254-Herramientas de trabajo
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 620.dp)
                .size(188.dp, 26.dp),
            text = "Herramientas de trabajo",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:255-Educacion
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 666.dp)
                .size(172.dp, 26.dp),
            text = "Educacion",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:256-Alimentacion
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 713.dp)
                .size(172.dp, 26.dp),
            text = "Alimentacion",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:257-Veiculos
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 761.dp)
                .size(172.dp, 26.dp),
            text = "Veiculos",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:258-Electronica
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 338.dp)
                .size(182.dp, 26.dp),
            text = "Electronica",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:259-Articulos para el hogar
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 59.dp, y = 290.dp)
                .size(182.dp, 26.dp),
            text = "Articulos para el hogar",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:261-Articulos deportivos
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 59.dp, y = 244.dp),
            text = "Articulos deportivos",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:365-Sugerencias para ti
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 14.dp, y = 197.dp),
            text = "Sugerencias para ti",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-1088:264-image 243
        Image(
            painter = painterResource(id = R.drawable.hogar),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 286.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:265-image 244
        Image(
            painter = painterResource(id = R.drawable.electronica),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 333.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:266-image 245
        Image(
            painter = painterResource(id = R.drawable.indumentaria),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 380.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:267-image 246
        Image(
            painter = painterResource(id = R.drawable.musica),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 428.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:268-image 247
        Image(
            painter = painterResource(id = R.drawable.deportes),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 239.dp)
                .size(30.dp, 30.dp),
        )
        // Image-1088:269-image 248
        Image(
            painter = painterResource(id = R.drawable.mascotas),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 475.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:270-image 249
        Image(
            painter = painterResource(id = R.drawable.oficina),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 522.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:271-image 250
        Image(
            painter = painterResource(id = R.drawable.artesanias),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 569.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:272-image 251
        Image(
            painter = painterResource(id = R.drawable.herramientas),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 616.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:273-image 252
        Image(
            painter = painterResource(id = R.drawable.educacion),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 663.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:274-image 253
        Image(
            painter = painterResource(id = R.drawable.alimentacion),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 710.dp)
                .size(33.dp, 30.dp),
        )
        // Image-1088:450-image 180
        Image(
            painter = painterResource(id = R.drawable.sinfondo),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 117.dp, y = 63.dp)
                .size(212.dp, 82.dp),
        )
        // Text-1088:600-No tienes busquedas guardadas. Busca algo
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 973.dp)
                .size(333.dp, 20.dp),
            text = "No tienes busquedas guardadas. Busca algo                      ",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-1088:601-nuevo
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 196.dp, y = 1001.dp)
                .size(58.dp, 19.dp),
            text = "nuevo",
            color = Color(0xff000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-1105:12-image 489
        Image(
            painter = painterResource(id = R.drawable.telescopio),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 122.dp, y = 806.dp)
                .size(187.dp, 187.dp),
        )
        // Empty-1099:166-Rectangle 776
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 153.dp)
                .background(Color(0xffffffff), RoundedCornerShape(30.dp))
                .size(390.dp, 37.dp),
        )
        // Text-1099:167-Buscar...
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -9.dp, y = 161.dp)
                .size(150.dp, 24.dp),
            text = "Buscar...",
            color = Color(0xff000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-1099:168-image 398
        Image(
            painter = painterResource(id = R.drawable.lupa),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 375.dp, y = 157.dp)
                .size(24.dp, 24.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun busquedafil() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                Busquedafil()
            }
        }
    }
}