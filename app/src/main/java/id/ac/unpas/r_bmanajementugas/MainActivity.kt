package id.ac.unpas.r_bmanajementugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import id.ac.unpas.r_bmanajementugas.tambah_tugas.TambahTugasScreen
import id.ac.unpas.r_bmanajementugas.ui.theme.RBManajemenTugasTheme
import dagger.hilt.android.AndroidEntryPoint
import id.ac.unpas.r_bmanajementugas.navigation.AppNavigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RBManajemenTugasTheme {
                val navController = rememberNavController()
                AppNavigation(navController = navController)
            }
        }
    }
}
