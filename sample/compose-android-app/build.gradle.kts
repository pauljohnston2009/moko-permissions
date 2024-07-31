plugins {
    id("dev.icerock.moko.gradle.android.application")
    id("org.jetbrains.compose")
}

android {
    namespace = "dev.icerock.moko.samples.permissions"

    defaultConfig {
        applicationId = "dev.icerock.moko.samples.permissions"
        minSdk = 21
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
    implementation(libs.composeActivity)
    implementation(libs.composeMaterial)
    implementation(projects.sample.mppLibrary)
    implementation(projects.permissionsCompose)
}
