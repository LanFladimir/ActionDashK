package com.fladimir.actiondashk

import android.content.Context
import android.content.pm.PackageInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fladimir.actiondashk.util.getSysApps
import com.fladimir.actiondashk.util.getThirdApps

class MainActivity : AppCompatActivity() {
    lateinit var mContext: Context
    var mSysApps: ArrayList<PackageInfo>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this
        mSysApps = getSysApps(mContext)
        getThirdApps(mContext)
    }
}
