package us.patient.app.factorydesignpattern.Java;

public class CarFactory {
    public Car getCar(Car.CarType car){
        switch (car){
            case AADI:
                return new AadiCar();
            case MARUTHI:
                return new MaruthiCar();
            case TATA:
                return new TataCar();
            default:
                return null;
        }
    }
}
