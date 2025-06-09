package id.ac.unpas.r_bmanajementugas.register

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor() : ViewModel() {

    var nama by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    var isRegistered by mutableStateOf(false)
        private set

    fun onNamaChange(newNama: String) {
        nama = newNama
    }

    fun onEmailChange(newEmail: String) {
        email = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
    }

    fun register() {
        if (nama.isNotBlank() && email.isNotBlank() && password.isNotBlank()) {
            // Simulasi register berhasil
            isRegistered = true
            errorMessage = null
        } else {
            errorMessage = "Semua field harus diisi"
        }
    }
}