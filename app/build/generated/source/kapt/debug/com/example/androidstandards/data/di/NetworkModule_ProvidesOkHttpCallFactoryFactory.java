// Generated by Dagger (https://dagger.dev).
package com.example.androidstandards.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.Call;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkHttpCallFactoryFactory implements Factory<Call.Factory> {
  @Override
  public Call.Factory get() {
    return providesOkHttpCallFactory();
  }

  public static NetworkModule_ProvidesOkHttpCallFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Call.Factory providesOkHttpCallFactory() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesOkHttpCallFactory());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesOkHttpCallFactoryFactory INSTANCE = new NetworkModule_ProvidesOkHttpCallFactoryFactory();
  }
}
