import com.android.build.gradle.internal.tasks.factory.dependsOn
import java.io.ByteArrayOutputStream

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mafia.prawable.image.resource"
    compileSdk = 33

    project.tasks.preBuild.dependsOn("create")

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    dataBinding {
        enable = true
    }
}

tasks.register("create") {
    // Copy resource to debug
    copy {
        from("/src/main/res/drawable")
        into("../debug/src/main/res/drawable")
    }

    // Copy resource to relase
    copy {
        from("/src/main/res/drawable")
        into("../release/src/main/assets")
    }
}