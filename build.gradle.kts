buildscript {
    repositories {
        gradlePluginPortal()
        google()
        gradlePluginPortal()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:7.0.0")

    }
}

allprojects {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
