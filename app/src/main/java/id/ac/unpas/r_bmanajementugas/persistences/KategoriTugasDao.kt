package id.ac.unpas.r_bmanajementugas.persistences

import androidx.room.*
import id.ac.unpas.r_bmanajementugas.model.KategoriTugas
import kotlinx.coroutines.flow.Flow

@Dao
interface KategoriTugasDao {
    @Query("SELECT * FROM kategori_tugas ORDER BY id DESC")
    fun loadAll(): Flow<List<KategoriTugas>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg kategori: KategoriTugas)

    @Delete
    suspend fun delete(kategori: KategoriTugas)
}