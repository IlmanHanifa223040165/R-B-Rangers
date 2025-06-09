package id.ac.unpas.r_bmanajementugas.Data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.persistences.AppDatabase;
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
public final class DatabaseModule_ProvideTugasDaoFactory implements Factory<TugasDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideTugasDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public TugasDao get() {
    return provideTugasDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideTugasDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideTugasDaoFactory(appDatabaseProvider);
  }

  public static TugasDao provideTugasDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTugasDao(appDatabase));
  }
}
