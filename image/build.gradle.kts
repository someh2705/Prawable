plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mafia.prawable.image"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    dataBinding {
        enable = true
    }
}
