package id.ac.unpas.r_bmanajementugas.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/Repository/TugasRepository;", "", "tugasDao", "Lid/ac/unpas/r_bmanajementugas/persistences/TugasDao;", "(Lid/ac/unpas/r_bmanajementugas/persistences/TugasDao;)V", "delete", "", "tugas", "Lid/ac/unpas/r_bmanajementugas/model/Tugas;", "(Lid/ac/unpas/r_bmanajementugas/model/Tugas;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "loadAll", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public final class TugasRepository {
    @org.jetbrains.annotations.NotNull()
    private final id.ac.unpas.r_bmanajementugas.persistences.TugasDao tugasDao = null;
    
    @javax.inject.Inject()
    public TugasRepository(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.persistences.TugasDao tugasDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<id.ac.unpas.r_bmanajementugas.model.Tugas>> loadAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.Tugas tugas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.Tugas tugas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}