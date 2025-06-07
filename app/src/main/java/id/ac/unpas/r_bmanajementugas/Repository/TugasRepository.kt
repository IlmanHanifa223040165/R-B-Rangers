package id.ac.unpas.r_bmanajementugas.Repository

import id.ac.unpas.r_bmanajementugas.model.Tugas
import id.ac.unpas.r_bmanajementugas.persistences.TugasDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TugasRepository @Inject constructor(
    private val tugasDao: TugasDao
) {
    fun loadAll(): Flow<List<Tugas>> = tugasDao.loadAll()

    suspend fun insert(tugas: Tugas) {
        tugasDao.insertAll(tugas)
    }

    suspend fun delete(tugas: Tugas) {
        tugasDao.delete(tugas)
    }
}