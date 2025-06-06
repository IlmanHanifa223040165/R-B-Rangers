package id.ac.unpas.r_bmanajementugas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val rvTugas: RecyclerView = findViewById(R.id.rv_tugas)
        rvTugas.layoutManager = LinearLayoutManager(this)

        // Data dummy untuk ditampilkan
        val daftarTugas = listOf(
            Tugas("Tugas 1", "Kategori A", "belum Selesai"),
            Tugas("Tugas 1", "Kategori A", "belum Selesai"),
            Tugas("Tugas 1", "Kategori A", "belum Selesai")
        )

        val adapter = TugasAdapter(daftarTugas)
        rvTugas.adapter = adapter
    }
}