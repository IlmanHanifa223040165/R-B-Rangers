package id.ac.unpas.r_bmanajementugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import id.ac.unpas.r_bmanajementugas.ui.theme.RBManajemenTugasTheme
import id.ac.unpas.r_bmanajementugas.login.LoginScreen
import id.ac.unpas.r_bmanajementugas.login.HomeScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RBManajemenTugasTheme {
                // Membuat NavController untuk navigasi antar screen
                val navController = rememberNavController()

                // Menampilkan NavHost untuk navigasi
                NavHost(navController = navController, startDestination = "login") {
                    // Rute untuk login screen
                    composable("login") {
                        LoginScreen(navController = navController)
                    }
                    // Rute untuk home screen (bisa diisi nanti)
                    composable("home") {
                        // Gantilah dengan HomeScreen yang sesuai
                        HomeScreen()
                    }
                }
            }
        }
    }
}
