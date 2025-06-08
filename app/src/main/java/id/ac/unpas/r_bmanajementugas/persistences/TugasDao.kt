package id.ac.unpas.r_bmanajementugas.persistences

import androidx.room.*
import id.ac.unpas.r_bmanajementugas.model.Tugas
import kotlinx.coroutines.flow.Flow

@Dao
interface TugasDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(tugas: Tugas)

    @Query("SELECT * FROM tugas ORDER BY id DESC")
    fun loadAll(): Flow<List<Tugas>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: Tugas)

    @Delete
    suspend fun delete(item: Tugas)
}