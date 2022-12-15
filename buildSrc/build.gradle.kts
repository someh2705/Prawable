plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("prawable") {
            id = "com.mafia.plugin.prawable"
            implementationClass = "PrawablePlugin"
        }
    }
}