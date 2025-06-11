package id.ac.unpas.r_bmanajementugas.Data;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/Data/DatabaseModule;", "", "()V", "provideAppDatabase", "Lid/ac/unpas/r_bmanajementugas/persistences/AppDatabase;", "appContext", "Landroid/content/Context;", "provideKategoriTugasDao", "Lid/ac/unpas/r_bmanajementugas/persistences/KategoriTugasDao;", "appDatabase", "provideTugasDao", "Lid/ac/unpas/r_bmanajementugas/persistences/TugasDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final id.ac.unpas.r_bmanajementugas.Data.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final id.ac.unpas.r_bmanajementugas.persistences.AppDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final id.ac.unpas.r_bmanajementugas.persistences.TugasDao provideTugasDao(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.persistences.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final id.ac.unpas.r_bmanajementugas.persistences.KategoriTugasDao provideKategoriTugasDao(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.persistences.AppDatabase appDatabase) {
        return null;
    }
}