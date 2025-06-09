package id.ac.unpas.r_bmanajementugas.persistences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH\'\u00a8\u0006\u0010"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/persistences/TugasDao;", "", "delete", "", "item", "Lid/ac/unpas/r_bmanajementugas/model/Tugas;", "(Lid/ac/unpas/r_bmanajementugas/model/Tugas;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "tugas", "insertAll", "items", "", "([Lid/ac/unpas/r_bmanajementugas/model/Tugas;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAll", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
@androidx.room.Dao()
public abstract interface TugasDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.Tugas tugas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM tugas ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<id.ac.unpas.r_bmanajementugas.model.Tugas>> loadAll();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.Tugas[] items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.Tugas item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}