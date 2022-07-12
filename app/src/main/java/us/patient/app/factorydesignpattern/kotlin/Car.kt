package us.patient.app.factorydesignpattern.kotlin

interface Car {
    enum class CarType {
        TATA, AADI, MARUTHI
    }
    fun display();
}