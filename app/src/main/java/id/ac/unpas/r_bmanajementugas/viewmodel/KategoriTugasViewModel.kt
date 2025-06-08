package id.ac.unpas.r_bmanajementugas.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.ac.unpas.r_bmanajementugas.model.KategoriTugas
import id.ac.unpas.r_bmanajementugas.Repository.KategoriTugasRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.collect

@HiltViewModel
class KategoriTugasViewModel @Inject constructor(
    private val repository: KategoriTugasRepository
) : ViewModel() {
    private val _kategoriList = MutableStateFlow<List<KategoriTugas>>(emptyList())
    val kategoriList: StateFlow<List<KategoriTugas>> get() = _kategoriList

    init {
        viewModelScope.launch {
            val existing = repository.loadAll().first()
            if (existing.isEmpty()) {
                repository.insert(KategoriTugas(namaKategori = "Kuliah"))
                repository.insert(KategoriTugas(namaKategori = "Organisasi"))
                repository.insert(KategoriTugas(namaKategori = "Pribadi"))
            } else{
                android.util.Log.d("KategoriVM", "Data sudah ada: ${existing.size}")
            }

            // Setelah insert, langsung collect data ke UI
            repository.loadAll().collect {
                _kategoriList.value = it
            }
        }
    }

    fun addKategori(kategori: KategoriTugas) {
        viewModelScope.launch {
            repository.insert(kategori)
        }
    }

    fun deleteKategori(kategori: KategoriTugas) {
        viewModelScope.launch {
            repository.delete(kategori)
        }
    }

}