package id.ac.unpas.r_bmanajementugas.persistences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/persistences/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "kategoriTugasDao", "Lid/ac/unpas/r_bmanajementugas/persistences/KategoriTugasDao;", "tugasDao", "Lid/ac/unpas/r_bmanajementugas/persistences/TugasDao;", "userDao", "Lid/ac/unpas/r_bmanajementugas/persistences/UserDao;", "app_debug"})
@androidx.room.Database(entities = {id.ac.unpas.r_bmanajementugas.model.Tugas.class, id.ac.unpas.r_bmanajementugas.model.User.class, id.ac.unpas.r_bmanajementugas.model.KategoriTugas.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract id.ac.unpas.r_bmanajementugas.persistences.TugasDao tugasDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract id.ac.unpas.r_bmanajementugas.persistences.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract id.ac.unpas.r_bmanajementugas.persistences.KategoriTugasDao kategoriTugasDao();
}