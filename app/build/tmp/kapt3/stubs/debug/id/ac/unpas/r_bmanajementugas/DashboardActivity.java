package id.ac.unpas.r_bmanajementugas;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/DashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lid/ac/unpas/r_bmanajementugas/TugasAdapter;", "fabAdd", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "rvTugas", "Landroidx/recyclerview/widget/RecyclerView;", "tugasViewModel", "Lid/ac/unpas/r_bmanajementugas/viewmodel/TugasViewModel;", "getTugasViewModel", "()Lid/ac/unpas/r_bmanajementugas/viewmodel/TugasViewModel;", "tugasViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DashboardActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView rvTugas;
    private id.ac.unpas.r_bmanajementugas.TugasAdapter adapter;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabAdd;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy tugasViewModel$delegate = null;
    
    public DashboardActivity() {
        super();
    }
    
    private final id.ac.unpas.r_bmanajementugas.viewmodel.TugasViewModel getTugasViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}