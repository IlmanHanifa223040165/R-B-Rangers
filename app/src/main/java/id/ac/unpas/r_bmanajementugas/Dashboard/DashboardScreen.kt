package id.ac.unpas.r_bmanajementugas.Dashboard



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import id.ac.unpas.r_bmanajementugas.model.Tugas
import id.ac.unpas.r_bmanajementugas.viewmodel.TugasViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController) {
    val tugasViewModel: TugasViewModel = hiltViewModel()
    val daftarTugas by tugasViewModel.tugasList.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dashboard Tugas") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("tambahTugas")
            }) {
                Icon(Icons.Default.Add, contentDescription = "Tambah Tugas")
            }
        }
    ) { padding ->
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(daftarTugas) { tugas ->
                TugasItem(tugas = tugas, onDelete = {
                    tugasViewModel.deleteTugas(it)
                })
                Divider()
            }
        }
    }
}

@Composable
fun TugasItem(tugas: Tugas, onDelete: (Tugas) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Judul: ${tugas.judul}", style = MaterialTheme.typography.titleMedium)
            Text(text = "Kategori: ${tugas.kategori}")
            Text(text = "Tanggal: ${tugas.tanggal}")
        }
        IconButton(onClick = { onDelete(tugas) }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Hapus")
        }
    }
}