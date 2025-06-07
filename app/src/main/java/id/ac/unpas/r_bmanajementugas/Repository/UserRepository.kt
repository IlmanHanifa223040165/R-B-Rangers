package id.ac.unpas.r_bmanajementugas.Repository

import id.ac.unpas.r_bmanajementugas.model.User
import id.ac.unpas.r_bmanajementugas.persistences.UserDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDao: UserDao
) {
    fun loadAll(): Flow<List<User>> = userDao.loadAll()

    suspend fun insert(user: User) {
        userDao.insertAll(user)
    }

    suspend fun delete(user: User) {
        userDao.delete(user)
    }
}