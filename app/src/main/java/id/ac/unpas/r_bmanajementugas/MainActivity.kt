package id.ac.unpas.r_bmanajementugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import id.ac.unpas.r_bmanajementugas.ui.theme.RBManajemenTugasTheme
import id.ac.unpas.r_bmanajementugas.tambah_tugas.TambahTugasScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RBManajemenTugasTheme {
                val navController = rememberNavController()

                // Menampilkan NavHost untuk navigasi
                NavHost(navController = navController, startDestination = "tambahTugas") {
                    // Ganti dengan rute yang konsisten
                    composable("tambahTugas") {  // Nama rute yang konsisten
                        TambahTugasScreen(navController = navController)
                    }
                }
            }
        }
    }
}