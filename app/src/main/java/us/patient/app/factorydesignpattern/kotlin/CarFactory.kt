package us.patient.app.factorydesignpattern.kotlin

object CarFactory {
      fun getCar(car:Car.CarType) : Car {
          when(car){
              Car.CarType.AADI -> return AadiCar()
              Car.CarType.MARUTHI -> return MarithiCar()
              Car.CarType.TATA -> return TataCar()
          }
      }
}