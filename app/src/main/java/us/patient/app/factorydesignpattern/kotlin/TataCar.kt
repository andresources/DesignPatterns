package us.patient.app.factorydesignpattern.kotlin

import android.util.Log

class TataCar: Car {
    override public fun display() {
        Log.i("VD", "This is Tata Car")
    }
}