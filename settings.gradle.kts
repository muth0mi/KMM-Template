pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}

rootProject.name = "PMI"
include(":iosApp")
include(":androidApp")
include(":shared")
