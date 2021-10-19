plugins {
    kotlin("android")
    id("com.android.application")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "io.github.muth0mi.project"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.4"
    }
}

repositories {
    google()
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.activity:activity-compose:1.3.1") // Integration with activities
    implementation("androidx.compose.material:material:1.0.4") // Compose Material Design
    implementation("androidx.compose.animation:animation:1.0.4") // Animations
    implementation("androidx.compose.ui:ui-tooling:1.0.4") // Tooling support (Previews, etc.)
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-rc01") // Integration with ViewModels
    implementation("com.google.accompanist:accompanist-insets:0.12.0") // Window Insets
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.4") // UI Tests
}
