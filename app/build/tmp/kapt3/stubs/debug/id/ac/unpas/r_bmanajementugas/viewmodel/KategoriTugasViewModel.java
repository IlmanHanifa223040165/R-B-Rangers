package id.ac.unpas.r_bmanajementugas.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/viewmodel/KategoriTugasViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lid/ac/unpas/r_bmanajementugas/Repository/KategoriTugasRepository;", "(Lid/ac/unpas/r_bmanajementugas/Repository/KategoriTugasRepository;)V", "_kategoriList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lid/ac/unpas/r_bmanajementugas/model/KategoriTugas;", "kategoriList", "Lkotlinx/coroutines/flow/StateFlow;", "getKategoriList", "()Lkotlinx/coroutines/flow/StateFlow;", "addKategori", "", "kategori", "deleteKategori", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class KategoriTugasViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final id.ac.unpas.r_bmanajementugas.Repository.KategoriTugasRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<id.ac.unpas.r_bmanajementugas.model.KategoriTugas>> _kategoriList = null;
    
    @javax.inject.Inject()
    public KategoriTugasViewModel(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.Repository.KategoriTugasRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<id.ac.unpas.r_bmanajementugas.model.KategoriTugas>> getKategoriList() {
        return null;
    }
    
    public final void addKategori(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.KategoriTugas kategori) {
    }
    
    public final void deleteKategori(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.model.KategoriTugas kategori) {
    }
}