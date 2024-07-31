plugins {
    id("dev.icerock.moko.gradle.android.application")
    id("kotlin-kapt")
}

android {
    buildFeatures.dataBinding = true

    namespace = "dev.icerock.moko.samples.permissions"

    defaultConfig {
        applicationId = "dev.icerock.moko.samples.permissions"

        versionCode = 1
        versionName = "0.1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.appCompat)
    implementation(libs.material)

    implementation(projects.sample.mppLibrary)
}
