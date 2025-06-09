package id.ac.unpas.r_bmanajementugas.Repository

import id.ac.unpas.r_bmanajementugas.model.KategoriTugas
import id.ac.unpas.r_bmanajementugas.persistences.KategoriTugasDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class KategoriTugasRepository @Inject constructor(
    private val kategoriTugasDao: KategoriTugasDao
) {
    fun loadAll(): Flow<List<KategoriTugas>> = kategoriTugasDao.loadAll()

    suspend fun insert(kategori: KategoriTugas) {
        kategoriTugasDao.insertAll(kategori)
    }

    suspend fun delete(kategori: KategoriTugas) {
        kategoriTugasDao.delete(kategori)
    }

}