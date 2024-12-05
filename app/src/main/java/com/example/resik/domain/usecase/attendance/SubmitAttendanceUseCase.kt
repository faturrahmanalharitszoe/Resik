//package com.example.resik.domain.usecase.attendance
//
//import com.example.resik.domain.model.attendance.Attendance
//import com.example.resik.domain.repository.attendance.IAttendanceRepository
//
//// domain/usecase/attendance/SubmitAttendanceUseCase.kt
//class SubmitAttendanceUseCase @Inject constructor(
//    private val repository: IAttendanceRepository
//) {
//    suspend operator fun invoke(attendance: Attendance): Result<Attendance> {
//        // Add business validation here
//        return repository.submitAttendance(attendance)
//    }
//}