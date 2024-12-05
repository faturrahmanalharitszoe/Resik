package com.example.resik.domain.repository.attendance

import com.example.resik.domain.model.attendance.Attendance

// domain/repository/attendance/IAttendanceRepository.kt
interface IAttendanceRepository {
    suspend fun submitAttendance(attendance: Attendance): Result<Attendance>
    suspend fun getAttendanceHistory(userId: String): Result<List<Attendance>>
    suspend fun getTodayAttendance(userId: String): Result<Attendance?>
}