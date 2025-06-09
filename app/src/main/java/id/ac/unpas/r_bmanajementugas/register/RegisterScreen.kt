package id.ac.unpas.r_bmanajementugas.register

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import android.widget.Toast
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun RegisterScreen(
    navController: NavController,
    viewModel: RegisterViewModel = hiltViewModel()
) {
    val context = LocalContext.current

    val nama by remember { derivedStateOf { viewModel.nama } }
    val email by remember { derivedStateOf { viewModel.email } }
    val password by remember { derivedStateOf { viewModel.password } }
    val errorMessage = viewModel.errorMessage
    val isRegistered = viewModel.isRegistered

    if (isRegistered) {
        // Arahkan ke login setelah register sukses
        LaunchedEffect(Unit) {
            Toast.makeText(context, "Registrasi berhasil", Toast.LENGTH_SHORT).show()
            navController.navigate("login") {
                popUpTo("register") { inclusive = true }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Daftar Akun", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = nama,
            onValueChange = viewModel::onNamaChange,
            label = { Text("Nama") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = viewModel::onEmailChange,
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = viewModel::onPasswordChange,
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = viewModel::register,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }

        errorMessage?.let {
            Spacer(modifier = Modifier.height(8.dp))
            Text(it, color = MaterialTheme.colorScheme.error)
        }
    }
}
