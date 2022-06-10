# Android-Starter-Project
Includes the use of fragments, navigation graph, safe args, dataBinding

## Dependency changes to be made:  

app level build.gradle:  
```
plugins {
    ...
    id 'org.jetbrains.kotlin.android'
    id 'androidx.navigation.safeargs.kotlin'
}

android{
  ...
  buildFeatures{
    dataBinding true
  }
}

dependencies{
  ...
  implementation 'androidx.navigation:navigation-fragment:2.4.2'
}
```

Project level build.gradle: (NOTE: Add this code above plugin{}  
```
buildscript {
    repositories {
        google()
    }
    dependencies {
        def nav_version = "2.4.2"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
```
