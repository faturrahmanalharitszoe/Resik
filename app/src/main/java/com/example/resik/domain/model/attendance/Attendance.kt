package com.example.resik.domain.model.attendance

// domain/model/attendance/Attendance.kt
data class Attendance(
    val id: Long,
    val userId: String,
    val timestamp: Long,
    val type: AttendanceType,
    val location: Location,
    val photo: String?,
    val notes: String?
)