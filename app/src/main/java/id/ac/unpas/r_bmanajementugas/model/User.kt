package id.ac.unpas.r_bmanajementugas.model

import androidx.room.Entity
import androidx.room.PrimaryKey

// Untuk request register
data class RegisterRequest(
    val name: String,
    val email: String,
    val password: String,
    val password_confirmation: String // Laravel butuh field ini
)

// Untuk request login
data class LoginRequest(
    val email: String,
    val password: String
)

// Untuk response register & login
data class AuthResponse(
    val access_token: String,
    val token_type: String,
    val user: User
)

// Untuk data user yang dikembalikan dari response
data class User(
    @PrimaryKey
    val id: Int,
    val name: String,
    val email: String
)