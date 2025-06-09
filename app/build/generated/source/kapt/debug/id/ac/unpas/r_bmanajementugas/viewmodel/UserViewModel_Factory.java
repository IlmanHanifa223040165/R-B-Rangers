package id.ac.unpas.r_bmanajementugas.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.ac.unpas.r_bmanajementugas.Repository.UserRepository;
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
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<UserRepository> repositoryProvider;

  public UserViewModel_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static UserViewModel_Factory create(Provider<UserRepository> repositoryProvider) {
    return new UserViewModel_Factory(repositoryProvider);
  }

  public static UserViewModel newInstance(UserRepository repository) {
    return new UserViewModel(repository);
  }
}
