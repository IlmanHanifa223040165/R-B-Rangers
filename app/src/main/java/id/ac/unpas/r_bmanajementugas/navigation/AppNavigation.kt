package id.ac.unpas.r_bmanajementugas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import id.ac.unpas.r_bmanajementugas.Dashboard.DashboardScreen
import id.ac.unpas.r_bmanajementugas.login.LoginScreen
import id.ac.unpas.r_bmanajementugas.register.RegisterScreen
import id.ac.unpas.r_bmanajementugas.tambah_tugas.TambahTugasScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "register") {
        composable("register") {
            RegisterScreen(navController)
        }
        composable("login") {
            LoginScreen(navController)
        }
        composable("dashboard") {
            DashboardScreen(navController)
        }
        composable("tambahTugas") {
            TambahTugasScreen(navController)
        }
    }
}