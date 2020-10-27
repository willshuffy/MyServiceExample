package com.willshuffyproject.myserviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.UnsupportedOperationException

class MyService : Service() {

    companion object{
        internal val TAG = MyService::class.java.simpleName
    }

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("Not yet implemnted")
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Log.d(TAG, "Service dijalankan...")
        GlobalScope.launch{
            delay(3000)
            stopSelf()
            Log.d(TAG, "Service dihentikan")
        }
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}
