//package com.example.resik.domain.usecase.attendance
//
//import com.example.resik.domain.model.attendance.Attendance
//import com.example.resik.domain.repository.attendance.IAttendanceRepository
//import
//
//// domain/usecase/attendance/GetAttendanceHistoryUseCase.kt
//class GetAttendanceHistoryUseCase @Inject constructor(
//    private val repository: IAttendanceRepository
//) {
//    suspend operator fun invoke(userId: String): Result<List<Attendance>> {
//        return repository.getAttendanceHistory(userId)
//    }
//}