package com.example.resik.presentation.attendance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.resik.presentation.navigation.Screen

// presentation/attendance/AttendanceScreen.kt
@Composable
fun AttendanceScreen(
    navController: NavController,
    onNavigateBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Top Bar
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Navigate Back */ }) {
                Icon(Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
            }
            Text(
                text = "Attendance",
                style = MaterialTheme.typography.displayMedium
            )
            Spacer(modifier = Modifier.width(48.dp))
        }

        // Clock & Date
        Column {
            Text(
                text = "Halo (Nama)",
                fontSize = 16.sp
            )
            Text(
                text = "Anda berada di (Nama Tempat)"
            )
        }

        // Check In/Out Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .weight(1f),
                onClick = {
                    navController.navigate(Screen.CheckIn.route) // Navigasi ke halaman Check In
                },
                shape = RoundedCornerShape(12.dp) // Sudut melengkung
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.CenterStart // Rata kiri di dalam Button
                ) {
                    Text(
                        text = "Absen Masuk\nJadwal Masuk :",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Start // Rata kiri teks multiline
                    )
                }
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .weight(1f),
                onClick = { /* Handle Check In */ },
                shape = RoundedCornerShape(12.dp) // Sudut melengkung
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.CenterStart // Rata kiri di dalam Button
                ) {
                    Text(
                        text = "Absen Keluar\nJadwal Keluar :",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Start // Rata kiri teks multiline
                    )
                }
            }

        }

        // Last Attendance Card
//        Card(
//            modifier = Modifier.fillMaxWidth(),
//            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
//        ) {
//            Column(
//                modifier = Modifier.padding(16.dp)
//            ) {
//                Text(
//                    text = "Last Attendance",
//                    style = MaterialTheme.typography.headlineMedium
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Check In: 08:30")
//                Text("Location: Office Resik HO")
//            }
//        }
    }
}