package id.ac.unpas.r_bmanajementugas.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.r_bmanajementugas.model.User
import id.ac.unpas.r_bmanajementugas.model.Tugas
import id.ac.unpas.r_bmanajementugas.model.KategoriTugas

@Database(
    entities = [Tugas::class, KategoriTugas::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tugasDao(): TugasDao
    abstract fun kategoriTugasDao(): KategoriTugasDao
}