package com.example.androidstandards;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AndroidStandardsApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface AndroidStandardsApp_GeneratedInjector {
  void injectAndroidStandardsApp(AndroidStandardsApp androidStandardsApp);
}
