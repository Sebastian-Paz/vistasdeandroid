//package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.myapplication.ui.theme.MyApplicationTheme
//import com.example.splashscreen.screens.UserProfileMainView
//import com.example.splashscreen.screens.ProfileEditScreen
//import com.example.splashscreen.screens.ProfileEditUserScreen
//import com.example.splashscreen.ui.theme.SplashScreenTheme
//import com.example.splashscreen.data.UserProfile
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyApplicationTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                ) {
//                    val navController = rememberNavController()
//
//                    NavHost(
//                        navController = navController,
//                        startDestination = "userProfileMain"
//                    ) {
//                        composable("userProfileMain") {
//                            UserProfileMainView(
//                                navController = navController,
//                                onMenuClick = { /* Manejo del menú */ }
//                            )
//                        }
//
//                        composable("profileEdit") {
//                            ProfileEditUserScreen(
//                                onMenuClick = { /* Manejo del menú */ },
//                                onUpdateProfile = {
//                                    navController.navigateUp()
//                                }
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MyApplicationTheme  {
//        val navController = rememberNavController()
//        UserProfileMainView(
//            navController = navController,
//            onMenuClick = {}
//        )
//    }
//}


package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.myapplication.screens.Busqueda1
import com.example.myapplication.screens.Busquedafil
import com.example.myapplication.screens.Cambiar1
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

        Cambiar1()
    }
}


