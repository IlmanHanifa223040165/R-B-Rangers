package id.ac.unpas.r_bmanajementugas.Repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.persistences.TugasDao;
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
public final class TugasRepository_Factory implements Factory<TugasRepository> {
  private final Provider<TugasDao> tugasDaoProvider;

  public TugasRepository_Factory(Provider<TugasDao> tugasDaoProvider) {
    this.tugasDaoProvider = tugasDaoProvider;
  }

  @Override
  public TugasRepository get() {
    return newInstance(tugasDaoProvider.get());
  }

  public static TugasRepository_Factory create(Provider<TugasDao> tugasDaoProvider) {
    return new TugasRepository_Factory(tugasDaoProvider);
  }

  public static TugasRepository newInstance(TugasDao tugasDao) {
    return new TugasRepository(tugasDao);
  }
}
