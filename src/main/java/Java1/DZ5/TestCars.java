package Java1.DZ5;

public class TestCars {
    public static void main(String[] args) {

        Car car1 = new Car("Борис","blue", "сидан", 5);
        Car car2 = new Car("сидан");
        Car car3 = new Car();
        System.out.println(car1.color);
        System.out.println(car2.color);
        System.out.println(car1.doors);
        System.out.println(car2.doors);
        System.out.println(Car.numberOfWheels);
        System.out.println(Car.mostPopularBrandOfCar());
        car1.moving();
        car2.buzz();
        System.out.println(car1.vin);
        System.out.println(car1.vin);
    }

}
