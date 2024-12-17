package com.example.resik.presentation.viewmodel
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.resik.data.remote.ApiService
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//class AuthViewModel @Inject constructor(
//    private val apiService: ApiService
//) : ViewModel() {
//
//    fun logout() {
//        viewModelScope.launch {
//            try {
//                apiService.logout()
//                // Clear local storage/preferences jika ada
//                // Contoh:
//                // preferencesManager.clearUserSession()
//            } catch (e: Exception) {
//                // Handle error
//            }
//        }
//    }
//}
