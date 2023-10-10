import Animal.Color;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Жигули",
                4,
                "V4",
                260,
                2,
                Color.BLACK
        );
        Ferrari ferrari = new Ferrari(
                "F8",
                4,
                "V12",
                450,
                4,
                Color.GRAY
        );
        Ferrari ferrari2 = new Ferrari(
                "F430",
                4,
                "V12",
                400,
                4,
                Color.BROWN
        );
        car.Car(car);
        ferrari.Car(car, ferrari);
        ferrari.Ferrari(ferrari);
        ferrari2.Ferrari(ferrari2);
    }
}