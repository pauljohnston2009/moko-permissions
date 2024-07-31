/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.permissions.desktop

import dev.icerock.moko.permissions.Permission
import dev.icerock.moko.permissions.PermissionState

// for now just allow all access
class PermissionsController : PermissionsControllerProtocol {

    override suspend fun providePermission(permission: Permission) {
        return getDelegate(permission).providePermission()
    }

    override suspend fun isPermissionGranted(permission: Permission): Boolean {
        return getDelegate(permission).getPermissionState() == PermissionState.Granted
    }

    override suspend fun getPermissionState(permission: Permission): PermissionState {
        return getDelegate(permission).getPermissionState()
    }

    override fun openAppSettings() {

    }

    private fun getDelegate(permission: Permission): PermissionDelegate {
        // for now just allow all access
        return AlwaysGrantedPermissionDelegate()
    }
}
