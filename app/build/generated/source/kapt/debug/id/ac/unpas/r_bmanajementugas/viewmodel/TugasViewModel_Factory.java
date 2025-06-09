package id.ac.unpas.r_bmanajementugas.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.Repository.TugasRepository;
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
public final class TugasViewModel_Factory implements Factory<TugasViewModel> {
  private final Provider<TugasRepository> tugasRepositoryProvider;

  public TugasViewModel_Factory(Provider<TugasRepository> tugasRepositoryProvider) {
    this.tugasRepositoryProvider = tugasRepositoryProvider;
  }

  @Override
  public TugasViewModel get() {
    return newInstance(tugasRepositoryProvider.get());
  }

  public static TugasViewModel_Factory create(Provider<TugasRepository> tugasRepositoryProvider) {
    return new TugasViewModel_Factory(tugasRepositoryProvider);
  }

  public static TugasViewModel newInstance(TugasRepository tugasRepository) {
    return new TugasViewModel(tugasRepository);
  }
}
