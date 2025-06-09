package id.ac.unpas.r_bmanajementugas.login

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var isLoggedIn by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    fun onEmailChange(newEmail: String) {
        email = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
    }

    fun login() {
        // Login dummy sementara
        if (email == "admin@student.com" && password == "admin123") {
            isLoggedIn = true
            errorMessage = null
        } else {
            errorMessage = "Email atau password salah"
        }
    }
}