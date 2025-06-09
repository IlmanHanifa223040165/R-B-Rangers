package id.ac.unpas.r_bmanajementugas.Data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.persistences.AppDatabase;
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
public final class DatabaseModule_ProvideKategoriTugasDaoFactory implements Factory<KategoriTugasDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideKategoriTugasDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public KategoriTugasDao get() {
    return provideKategoriTugasDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideKategoriTugasDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideKategoriTugasDaoFactory(appDatabaseProvider);
  }

  public static KategoriTugasDao provideKategoriTugasDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideKategoriTugasDao(appDatabase));
  }
}
