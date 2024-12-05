package com.example.resik.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.resik.presentation.attendance.AttendanceScreen
import com.example.resik.presentation.attendance.CheckInScreen
import com.example.resik.presentation.main.MainScreen

// presentation/navigation/NavGraph.kt
sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Attendance : Screen("attendance")
    object Checklist : Screen("checklist")
    object AtmChecklist : Screen("atm_checklist")
    object CheckIn : Screen("check_in")
}


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
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
                }
            )
        }
        composable(Screen.Attendance.route) {
            AttendanceScreen(
                navController = navController,
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }

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
