package com.example.myapplication.Features


import android.util.Log


class LOG {

    companion object{
        fun Info(Tag: String,Mensaje: String) {
            Log.i("INFO- $Tag",Mensaje)
        }
        fun Assert(Tag: String,Mensaje: String) {
            Log.wtf("ASSERT- $Tag",Mensaje)
        }
        fun Debug(Tag: String,Mensaje: String) {
            Log.d("DEBUG- $Tag",Mensaje)
        }
        fun Error(Tag: String,Mensaje: String) {
            Log.e("ERROR- $Tag",Mensaje)
        }
        fun Verbose(Tag: String,Mensaje: String) {
            Log.v("VERBOSE- $Tag",Mensaje)
        }
        fun Warn(Tag: String,Mensaje: String) {
            Log.w("WARN- $Tag",Mensaje)
        }
    }

}