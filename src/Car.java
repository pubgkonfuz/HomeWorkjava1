import Animal.Color;

public class Car extends Transport{


    public Car(String model, int wheels, String engine, int maxSpeed, int privod, Color color) {
        super(model, wheels, engine, maxSpeed, privod, color);
    }

    public  void Car(Car car) {
        System.out.println("-------------");
        System.out.println("car model " + car.getModel());
        System.out.println("car wheels " + car.getWheels());
        System.out.println("car engine " + car.getEngine());
        System.out.println("car maxSpeed " + car.getMaxSpeed());
        System.out.println("car privod " + car.getPrivod());
        System.out.println("car color " + car.getColor());

    }
     public final void Car(Car car,Ferrari ferrari){

    }
    {

    }


}
