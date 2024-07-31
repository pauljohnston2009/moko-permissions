/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("dev.icerock.moko.gradle.multiplatform.mobile")
    id("dev.icerock.moko.gradle.publication")
    id("dev.icerock.moko.gradle.stub.javadoc")
    id("org.jetbrains.compose")
}

kotlin {
    jvm("desktop")

    sourceSets {
        val commonMain by getting
        val desktopMain by getting {
            dependsOn(commonMain)
        }
    }
}

android {
    namespace = "dev.icerock.moko.permissions.compose"

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    commonMainApi(projects.permissions)
    commonMainApi(compose.runtime)
    androidMainImplementation(libs.activity)
    androidMainImplementation(libs.composeUi)
    androidMainImplementation(libs.lifecycleRuntime)
}
