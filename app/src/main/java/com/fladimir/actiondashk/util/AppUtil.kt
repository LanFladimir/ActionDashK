package com.fladimir.actiondashk.util

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.util.Log

fun getSysApps(context: Context): ArrayList<PackageInfo> {
    val mPM = context.packageManager
    val packageInfoList: List<PackageInfo> = mPM.getInstalledPackages(0)
    return packageInfoList as ArrayList<PackageInfo>
}

fun getThirdApps(context: Context) {
    val mPM = context.packageManager
    val packageList: List<PackageInfo> = mPM.getInstalledPackages(0)
    packageList.forEach { info ->
        if (info.applicationInfo.flags == 0 && ApplicationInfo.FLAG_UPDATED_SYSTEM_APP == 0) {
            info.applicationInfo.loadIcon(mPM)//drawable
            Log.i("appName(3)", info.applicationInfo.loadLabel(mPM).toString())
        }
    }
}