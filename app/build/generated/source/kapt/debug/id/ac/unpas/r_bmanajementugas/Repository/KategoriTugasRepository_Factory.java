package id.ac.unpas.r_bmanajementugas.Repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.persistences.KategoriTugasDao;
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
public final class KategoriTugasRepository_Factory implements Factory<KategoriTugasRepository> {
  private final Provider<KategoriTugasDao> kategoriTugasDaoProvider;

  public KategoriTugasRepository_Factory(Provider<KategoriTugasDao> kategoriTugasDaoProvider) {
    this.kategoriTugasDaoProvider = kategoriTugasDaoProvider;
  }

  @Override
  public KategoriTugasRepository get() {
    return newInstance(kategoriTugasDaoProvider.get());
  }

  public static KategoriTugasRepository_Factory create(
      Provider<KategoriTugasDao> kategoriTugasDaoProvider) {
    return new KategoriTugasRepository_Factory(kategoriTugasDaoProvider);
  }

  public static KategoriTugasRepository newInstance(KategoriTugasDao kategoriTugasDao) {
    return new KategoriTugasRepository(kategoriTugasDao);
  }
}
