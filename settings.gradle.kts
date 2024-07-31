/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        sourceControl {
            gitRepository(uri("https://github.com/pauljohnston2009/moko-gradle-plugin.git")) {
                producesModule("dev.icerock.moko:moko-gradle-plugin")
            }
        }
    }
}

include(":permissions")
include(":permissions-compose")
include(":permissions-test")
include(":sample:android-app")
include(":sample:compose-android-app")
include(":sample:mpp-library")
