package id.ac.unpas.r_bmanajementugas.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.r_bmanajementugas.model.Tugas

@Database(
    entities = [Tugas::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tugasDao(): TugasDao
}