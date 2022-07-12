package us.patient.app.factorydesignpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import us.patient.app.factorydesignpattern.kotlin.Car
import us.patient.app.factorydesignpattern.kotlin.CarFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickme(view: View) {
        //Using Java
        //CarFactory().getCar(Car.CarType.AADI).display()
        //CarFactory().getCar(Car.CarType.TATA).display()
        //CarFactory().getCar(Car.CarType.MARUTHI).display()

        //Using Kotlin
        CarFactory.getCar(Car.CarType.TATA).display()
        CarFactory.getCar(Car.CarType.AADI).display()
        CarFactory.getCar(Car.CarType.MARUTHI).display()
    }
}