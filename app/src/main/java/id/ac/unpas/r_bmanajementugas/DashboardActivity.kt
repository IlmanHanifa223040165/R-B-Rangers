package id.ac.unpas.r_bmanajementugas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.floatingactionbutton.FloatingActionButton // Import FAB
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import id.ac.unpas.r_bmanajementugas.viewmodel.TugasViewModel
@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private lateinit var rvTugas: RecyclerView
    private lateinit var adapter: TugasAdapter
    private lateinit var fabAdd: FloatingActionButton // Deklarasi FAB

    // Ambil ViewModel dengan Hilt
    private val tugasViewModel: TugasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        rvTugas = findViewById(R.id.rv_tugas)
        rvTugas.layoutManager = LinearLayoutManager(this)

        // Inisialisasi FloatingActionButton
        fabAdd = findViewById(R.id.fab_add)
        fabAdd.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Inisialisasi adapter dengan list kosong dan handler delete
        adapter = TugasAdapter(emptyList()) { tugas ->
            tugasViewModel.deleteTugas(tugas)
        }
        rvTugas.adapter = adapter

        // Observasi data
        lifecycleScope.launch {
            tugasViewModel.tugasList.collectLatest { daftarTugas ->
                adapter.setData(daftarTugas)
            }
        }
    }
}

