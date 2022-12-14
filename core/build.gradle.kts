plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    kotlin("kapt")
}

android {
    namespace = "com.mafia.prawable.core"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33

        buildConfigField("Boolean", "DEBUG", "true")
    }

    dataBinding {
        enable = true
    }

    buildTypes {
        debug {
            buildConfigField("Boolean", "DEBUG", "true")
        }
        release {
            buildConfigField("Boolean", "DEBUG", "false")
        }
    }
}

dependencies {
    implementation(project(":image"))
    ksp("com.android.databinding:compiler:3.1.4")
}
