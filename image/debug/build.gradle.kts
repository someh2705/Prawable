plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.mafia.prawable.image.debug"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    dataBinding {
        enable = true
    }
}

dependencies {
    implementation(project(":image:config"))
    kapt("com.android.databinding:compiler:3.1.4")
}