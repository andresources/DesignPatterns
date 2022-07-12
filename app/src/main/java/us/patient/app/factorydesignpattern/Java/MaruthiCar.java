package us.patient.app.factorydesignpattern.Java;

import android.util.Log;

public class MaruthiCar implements Car{
    @Override
    public void display() {
        Log.i("VD","This is Maruthi Car");
    }
}
