package id.ac.unpas.r_bmanajementugas.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.ac.unpas.r_bmanajementugas.model.Tugas
import id.ac.unpas.r_bmanajementugas.Repository.TugasRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TugasViewModel @Inject constructor(
    private val tugasRepository: TugasRepository
) : ViewModel() {

    private val _tugasList = MutableStateFlow<List<Tugas>>(emptyList())
    val tugasList: StateFlow<List<Tugas>> get() = _tugasList

    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            tugasRepository.loadAll().collect {
                _tugasList.value = it
            }
        }
    }

    fun addTugas(tugas: Tugas) {
        viewModelScope.launch {
            tugasRepository.insert(tugas)
        }
    }

    fun deleteTugas(tugas: Tugas) {
        viewModelScope.launch {
            tugasRepository.delete(tugas)
        }
    }
}