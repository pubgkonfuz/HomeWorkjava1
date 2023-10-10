import Animal.Color;

public final class Ferrari extends Car {


    public Ferrari(String model, int wheels, String engine, int maxSpeed, int privod, Color color) {
        super(model, wheels, engine, maxSpeed, privod, color);
    }
    public void Ferrari(Ferrari ferrari){
        System.out.println("--------------");
        System.out.println("car model " + ferrari.getModel());
        System.out.println("car wheels " + ferrari.getWheels());
        System.out.println("car engine " + ferrari.getEngine());
        System.out.println("car maxSpeed " + ferrari.getMaxSpeed());
        System.out.println("car privod " + ferrari.getPrivod());
        System.out.println("car color " + ferrari.getColor());
    }

    @Override
    public void Car(Car car) {
        System.out.println("Car");

    }
}

