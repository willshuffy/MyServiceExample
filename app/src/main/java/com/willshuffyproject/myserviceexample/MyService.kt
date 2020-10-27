package com.willshuffyproject.myserviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.lang.UnsupportedOperationException

class MyService : Service() {

    companion object{
        internal val TAG = MyService::class.java.simpleName
    }

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("Not yet implemnted")
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: ")
        return START_STICKY
    }
}
