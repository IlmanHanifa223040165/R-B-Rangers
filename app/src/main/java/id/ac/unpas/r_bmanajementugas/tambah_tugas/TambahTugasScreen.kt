package id.ac.unpas.r_bmanajementugas.tambah_tugas

import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.ac.unpas.r_bmanajementugas.ui.theme.RBManajemenTugasTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background



@Composable
fun TambahTugasScreen(navController: NavController) {
    var judul by remember { mutableStateOf("") }
    var deskripsi by remember { mutableStateOf("") }
    var tanggal by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Tambah Tugas",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(bottom = 24.dp)
                .align(Alignment.CenterHorizontally)
        )


        // Input Judul
        OutlinedTextField(
            value = judul,
            onValueChange = { judul = it },
            label = { Text("Judul Tugas") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Input Deskripsi
        OutlinedTextField(
            value = deskripsi,
            onValueChange = { deskripsi = it },
            label = { Text("Deskripsi") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = false,
            maxLines = 5
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Input Tanggal
        OutlinedTextField(
            value = tanggal,
            onValueChange = { tanggal = it },
            label = { Text("Tanggal") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Tombol Tambah Tugas
        Button(
            onClick = {
                if (judul.isNotEmpty() && deskripsi.isNotEmpty() && tanggal.isNotEmpty()) {

                    errorMessage = null  // Reset error message jika valid
                } else {
                    errorMessage = "Semua field harus diisi"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tambah Tugas")
        }

        // Tampilkan pesan error jika form tidak valid
        errorMessage?.let {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = it, color = MaterialTheme.colorScheme.error)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTambahTugasScreen() {
    TambahTugasScreen(navController = rememberNavController())
}