package us.patient.app.factorydesignpattern.Java;

import android.util.Log;

public class TataCar implements Car{
    @Override
    public void display() {
        Log.i("VD","This is Tata Car");
    }
}
