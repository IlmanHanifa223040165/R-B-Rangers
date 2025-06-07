package id.ac.unpas.r_bmanajementugas.Data

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.ac.unpas.r_bmanajementugas.persistences.AppDatabase
import id.ac.unpas.r_bmanajementugas.persistences.TugasDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        appContext: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "tugas-db"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideTugasDao(appDatabase: AppDatabase): TugasDao {
        return appDatabase.tugasDao()
    }
}