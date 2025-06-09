package id.ac.unpas.r_bmanajementugas.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.ac.unpas.r_bmanajementugas.model.User
import id.ac.unpas.r_bmanajementugas.Repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val repository: UserRepository
) : ViewModel() {

    private val _userList = MutableStateFlow<List<User>>(emptyList())
    val userList: StateFlow<List<User>> get() = _userList

    init {
        loadAll()
    }

    private fun loadAll() {
        viewModelScope.launch {
            repository.loadAll().collect {
                _userList.value = it
            }
        }
    }

    fun addUser(user: User) {
        viewModelScope.launch {
            repository.insert(user)
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            repository.delete(user)
        }
    }
}