package id.ac.unpas.r_bmanajementugas.network

import id.ac.unpas.r_bmanajementugas.model.AuthResponse
import id.ac.unpas.r_bmanajementugas.model.LoginRequest
import id.ac.unpas.r_bmanajementugas.model.RegisterRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST



interface ApiService {

    @POST("api/register")
    suspend fun register(
        @Body request: RegisterRequest
    ): Response<AuthResponse>

    @POST("api/login")
    suspend fun login(
        @Body request: LoginRequest
    ): Response<AuthResponse>


}