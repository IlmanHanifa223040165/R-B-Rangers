package id.ac.unpas.r_bmanajementugas.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kategori_tugas")
data class KategoriTugas(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val namaKategori: String
)