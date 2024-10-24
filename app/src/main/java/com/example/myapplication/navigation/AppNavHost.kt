//package com.example.myapplication.navigation
//
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
////import androidx.navigation.NavHostController
////import androidx.navigation.NavType
////import androidx.navigation.compose.NavHost
////import androidx.navigation.compose.composable
////import androidx.navigation.navArgument
//import com.example.myapplication.R
//import com.example.myapplication.data.Movie
//import com.example.myapplication.navigation.NavigationItem
//import com.example.myapplication.screens.DetailScreen
//import com.example.myapplication.screens.HomeScreen
//import com.example.myapplication.screens.LoginScreen
//import com.example.myapplication.screens.ProfileEditScreen
//import com.example.myapplication.screens.UserProfileMainView
//
//@Composable
//fun AppNavHost(
//    modifier: Modifier = Modifier,
//    navController: NavHostController,
//    startDestination: String = NavigationItem.Login.route
//) {
//    NavHost(
//        modifier = modifier,
//        navController = navController,
//        startDestination = startDestination
//    ) {
//        // Login Screen
//        composable(NavigationItem.Login.route) {
//            LoginScreen(navController)
//        }
//
//        // Home Screen
//        composable(NavigationItem.Home.route) {
//            HomeScreen(navController)
//        }
//
//        // User Profile Screens
//        composable("userProfileMain") {
//            UserProfileMainView(
//                navController = navController,
//                onMenuClick = { /* acción de menú aquí */ }
//            )
//        }
//
//        composable("profileEdit") {
//            ProfileEditScreen(
//                onMenuClick = { /* acción de menú aquí */ },
//                onUpdateProfile = {
//                    navController.navigateUp()
//                }
//            )
//        }
//
//        // Detail Screen
//        composable(
//            route = NavigationItem.Detail.route + "/{movieName}/{movieImage}",
//            arguments = listOf(
//                navArgument("movieName") {
//                    defaultValue = ""
//                    type = NavType.StringType
//                },
//                navArgument("movieImage") {
//                    defaultValue = R.drawable.no_image_available
//                    type = NavType.IntType
//                }
//            )
//        ) {
//            val image = it.arguments?.getInt("movieImage") ?: R.drawable.no_image_available
//            val name = it.arguments?.getString("movieName") ?: ""
//            DetailScreen(
//                movie = Movie(image = image, name = name),
//                navController = navController
//            )
//        }
//    }
//}