// Generated by Dagger (https://dagger.dev).
package com.example.androidstandards.viewmodel;

import com.example.androidstandards.data.repository.FlickrRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<FlickrRepo> flickrRepoProvider;

  public HomeViewModel_Factory(Provider<FlickrRepo> flickrRepoProvider) {
    this.flickrRepoProvider = flickrRepoProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(flickrRepoProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<FlickrRepo> flickrRepoProvider) {
    return new HomeViewModel_Factory(flickrRepoProvider);
  }

  public static HomeViewModel newInstance(FlickrRepo flickrRepo) {
    return new HomeViewModel(flickrRepo);
  }
}