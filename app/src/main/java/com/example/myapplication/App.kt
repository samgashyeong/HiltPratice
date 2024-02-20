package com.example.myapplication

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {


    @Inject
    lateinit var myname: Myname

    override fun onCreate() {
        super.onCreate()

        Log.e(TAG, "onCreate: ${myname.toString()}", )
    }
}