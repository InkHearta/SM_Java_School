package DZ5;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Car { static int numberOfWheels = 4;
    UUID vin = randomUUID();
    int doors = 4;
    String bodyType = "сидан";
    String color = "белый";
    String owner;


public Car() {

}
public Car(String owner, String color, String bodyType, int doors){
    this.owner = owner;
    this.color = color;
    this.bodyType = bodyType;
    this.doors = doors;
}

public Car(String bodyType) {
    this.bodyType = bodyType;
}
public void moving(){
    System.out.println(String.format("%s машина принадлежащая %sу едет ", color, owner));
}
public void buzz(){
    System.out.println("бип бип");
}

public static String mostPopularBrandOfCar(){
    String brandOfCar = "kia";
    return brandOfCar;

}
}
