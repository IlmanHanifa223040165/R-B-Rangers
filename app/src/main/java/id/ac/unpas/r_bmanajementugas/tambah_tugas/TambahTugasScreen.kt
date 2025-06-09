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
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.hilt.navigation.compose.hiltViewModel
import id.ac.unpas.r_bmanajementugas.viewmodel.KategoriTugasViewModel
import id.ac.unpas.r_bmanajementugas.model.KategoriTugas
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import id.ac.unpas.r_bmanajementugas.viewmodel.TugasViewModel
import id.ac.unpas.r_bmanajementugas.model.Tugas
import android.content.Intent
import androidx.compose.ui.platform.LocalContext



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TambahTugasScreen(navController: NavController? = null) {
    var judul by remember { mutableStateOf("") }
    var deskripsi by remember { mutableStateOf("") }
    var tanggal by remember { mutableStateOf("") }
    var selectedKategori by remember { mutableStateOf<String?>(null) }
    var expanded by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    val kategoriViewModel: KategoriTugasViewModel = hiltViewModel()
    val kategoriList by kategoriViewModel.kategoriList.collectAsState()
    val scrollState = rememberScrollState()
    val tugasViewModel: TugasViewModel = hiltViewModel()
    val context = LocalContext.current



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF90CAF9))
            .padding(24.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Tambah Tugas",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(bottom = 24.dp)
                .align(Alignment.CenterHorizontally),
            color = Color.Black
        )

        OutlinedTextField(
            value = judul,
            onValueChange = { judul = it },
            label = { Text("Judul Tugas", color = Color.Black) },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black, // Teks saat fokus menjadi hitam
                unfocusedTextColor = Color.Black, // Teks saat tidak fokus juga hitam
                focusedBorderColor = Color.Black, // Border saat fokus menjadi hitam
                unfocusedBorderColor = Color.DarkGray // Border saat tidak fokus menjadi abu-abu gelap
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = deskripsi,
            onValueChange = { deskripsi = it },
            label = { Text("Deskripsi", color = Color.Black) },
            modifier = Modifier.fillMaxWidth(),
            maxLines = 5,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black, // Teks saat fokus menjadi hitam
                unfocusedTextColor = Color.Black, // Teks saat tidak fokus juga hitam
                focusedBorderColor = Color.Black, // Border saat fokus menjadi hitam
                unfocusedBorderColor = Color.DarkGray // Border saat tidak fokus menjadi abu-abu gelap
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = tanggal,
            onValueChange = { tanggal = it },
            label = { Text("Tanggal", color = Color.Black) },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedTextColor = Color.Black, // Teks saat fokus menjadi hitam
                unfocusedTextColor = Color.Black, // Teks saat tidak fokus juga hitam
                focusedBorderColor = Color.Black, // Border saat fokus menjadi hitam
                unfocusedBorderColor = Color.DarkGray // Border saat tidak fokus menjadi abu-abu gelap
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Dropdown
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            OutlinedTextField(
                value = selectedKategori ?: "",
                onValueChange = {},
                readOnly = true,
                label = { Text("Pilih Kategori", color = Color.Black) }, // Label teks juga hitam
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedTextColor = Color.Black,   // Teks yang ditampilkan (selectedKategori) saat fokus
                    unfocusedTextColor = Color.Black, // Teks yang ditampilkan (selectedKategori) saat tidak fokus
                    focusedBorderColor = Color.Black, // Border saat fokus
                    unfocusedBorderColor = Color.DarkGray, // Border saat tidak fokus (lebih tegas)
                    // Anda juga bisa mengatur `containerColor` jika ingin mengubah warna latar belakangnya
                )
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                kategoriList.forEach { kategori ->
                    DropdownMenuItem(
                        text = { Text(kategori.namaKategori, color = Color.White) }, // Pastikan teks item dropdown juga hitam
                        onClick = {
                            selectedKategori = kategori.namaKategori
                            expanded = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (judul.isNotEmpty() && deskripsi.isNotEmpty() && tanggal.isNotEmpty() && selectedKategori != null) {
                    val tugas = Tugas(
                        judul = judul,
                        deskripsi = deskripsi,
                        tanggal = tanggal,
                        kategori = selectedKategori!!
                    )
                    tugasViewModel.addTugas(tugas)
                    errorMessage = null
                    // Navigasi ke Dashboard

                    navController?.navigate("dashboard") {
                        popUpTo("tambahTugas") { inclusive = true }
                    }

                } else {
                errorMessage = "Semua field harus diisi"
            }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tambah Tugas")
        }

        errorMessage?.let {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = it, color = MaterialTheme.colorScheme.error)
        }
    }
}