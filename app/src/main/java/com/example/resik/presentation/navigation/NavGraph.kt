package com.example.resik.presentation.navigation

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.resik.presentation.attendance.AttendanceScreen
import com.example.resik.presentation.attendance.CheckInScreen
import com.example.resik.presentation.main.MainScreen

// presentation/navigation/NavGraph.kt
sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Main : Screen("main")
    object Attendance : Screen("attendance")
    object Checklist : Screen("checklist")
    object AtmChecklist : Screen("atm_checklist")
    object CheckIn : Screen("check_in")
}


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route) {
        // Login Screen
        composable(Screen.Login.route) {
            LoginScreen(onLoginSuccess = {
                navController.navigate(Screen.Main.route) {
                    popUpTo(Screen.Login.route) { inclusive = true }
                }
            })
        }

        // Main Screen
        composable(Screen.Main.route) {
            MainScreen(
                onNavigateToAttendance = {
                    navController.navigate(Screen.Attendance.route)
                },
                onNavigateToChecklist = {
                    navController.navigate(Screen.Checklist.route)
                },
                onNavigateToAtmChecklist = {
                    navController.navigate(Screen.AtmChecklist.route)
                },
                onLogout = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }

        // Attendance Screen
        composable(Screen.Attendance.route) {
            AttendanceScreen(
                navController = navController,
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }

        // Check-In Screen
        composable(Screen.CheckIn.route) {
            CheckInScreen(
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }

//        composable(Screen.Checklist.route) {
//            ChecklistScreen(
//                onNavigateBack = {
//                    navController.navigateUp()
//                }
//            )
//        }
//        composable(Screen.AtmChecklist.route) {
//            AtmChecklistScreen(
//                onNavigateBack = {
//                    navController.navigateUp()
//                }
//            )
//        }
    }
}
