plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.gitconflictdemo"
    compileSdk {
        version = release(37)
    }
    buildToolsVersion = "36.0.0"

    defaultConfig {
        applicationId = "com.example.gitconflictdemo"
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
