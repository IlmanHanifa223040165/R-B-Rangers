package id.ac.unpas.r_bmanajementugas.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.Repository.KategoriTugasRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class KategoriTugasViewModel_Factory implements Factory<KategoriTugasViewModel> {
  private final Provider<KategoriTugasRepository> repositoryProvider;

  public KategoriTugasViewModel_Factory(Provider<KategoriTugasRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public KategoriTugasViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static KategoriTugasViewModel_Factory create(
      Provider<KategoriTugasRepository> repositoryProvider) {
    return new KategoriTugasViewModel_Factory(repositoryProvider);
  }

  public static KategoriTugasViewModel newInstance(KategoriTugasRepository repository) {
    return new KategoriTugasViewModel(repository);
  }
}
