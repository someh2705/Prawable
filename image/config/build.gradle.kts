import com.android.build.gradle.internal.tasks.factory.dependsOn
import java.io.ByteArrayOutputStream

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mafia.prawable.image.config"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    dataBinding {
        enable = true
    }
}