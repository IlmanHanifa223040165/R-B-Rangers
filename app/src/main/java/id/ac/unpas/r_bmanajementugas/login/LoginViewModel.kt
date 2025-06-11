package id.ac.unpas.r_bmanajementugas.login

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.ac.unpas.r_bmanajementugas.model.LoginRequest
import id.ac.unpas.r_bmanajementugas.network.ApiService
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var isLoggedIn by mutableStateOf(false)
        private set
    var errorMessage by mutableStateOf<String?>(null)

    fun onEmailChange(newEmail: String) {
        email = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
    }

    fun login() {
        viewModelScope.launch {
            try {
                val response = apiService.login(
                    LoginRequest(email = email, password = password)
                )
                // Simpan token kalau perlu
                isLoggedIn = true
                errorMessage = null
            } catch (e: Exception) {
                errorMessage = "Login gagal: ${e.message}"
            }
        }
    }
}
