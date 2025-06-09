package id.ac.unpas.r_bmanajementugas;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/TugasAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lid/ac/unpas/r_bmanajementugas/TugasAdapter$TugasViewHolder;", "listTugas", "", "Lid/ac/unpas/r_bmanajementugas/model/Tugas;", "onDeleteClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "TugasViewHolder", "app_debug"})
public final class TugasAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<id.ac.unpas.r_bmanajementugas.TugasAdapter.TugasViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<id.ac.unpas.r_bmanajementugas.model.Tugas> listTugas;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<id.ac.unpas.r_bmanajementugas.model.Tugas, kotlin.Unit> onDeleteClick = null;
    
    public TugasAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<id.ac.unpas.r_bmanajementugas.model.Tugas> listTugas, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super id.ac.unpas.r_bmanajementugas.model.Tugas, kotlin.Unit> onDeleteClick) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public id.ac.unpas.r_bmanajementugas.TugasAdapter.TugasViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    id.ac.unpas.r_bmanajementugas.TugasAdapter.TugasViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<id.ac.unpas.r_bmanajementugas.model.Tugas> newList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lid/ac/unpas/r_bmanajementugas/TugasAdapter$TugasViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteButton", "Landroid/widget/ImageView;", "getDeleteButton", "()Landroid/widget/ImageView;", "kategoriTugas", "Landroid/widget/TextView;", "getKategoriTugas", "()Landroid/widget/TextView;", "namaTugas", "getNamaTugas", "statusTugas", "getStatusTugas", "app_debug"})
    public static final class TugasViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView namaTugas = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView kategoriTugas = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView statusTugas = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView deleteButton = null;
        
        public TugasViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNamaTugas() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getKategoriTugas() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getStatusTugas() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDeleteButton() {
            return null;
        }
    }
}