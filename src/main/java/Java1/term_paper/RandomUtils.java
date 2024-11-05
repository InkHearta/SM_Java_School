package Java1.term_paper;
import com.github.javafaker.Faker;

import java.util.ArrayList;

public class RandomUtils {

static public Apple randomApple(){
    Faker faker = Faker.instance();
    long weight = faker.number().randomNumber();
    String sort = faker.name().name();
    boolean waxTreatment = faker.bool().bool();
    boolean sidrReady = faker.bool().bool();
    return new Apple(weight, sort, waxTreatment, sidrReady);
}
static public Orange randomOrange(){
    Faker faker = Faker.instance();
    long weight = faker.number().randomNumber();
    String sort = faker.name().name();
    long peelThickness = faker.number().randomNumber();
    long numberOfSlices = faker.number().numberBetween(9,11);
    return new Orange(weight, sort, peelThickness, numberOfSlices);
}

static public ArrayList randomFruits(){
    Faker faker = Faker.instance();
    long numberOfFruits = faker.number().numberBetween(5,30);
    ArrayList<Fruit> randomFruitsArray = new ArrayList<>();
    for(int i = 0; i < numberOfFruits; i++) {
        String[] fruits = {"apple", "orange"};
        int randomFruits = (int) (Math.random() * fruits.length);
        String randomFruit = fruits[randomFruits];
        if (randomFruit.equals("apple")){
            randomFruitsArray.add(randomApple());
        }
        else if (randomFruit.equals("orange")) {
            randomFruitsArray.add(randomOrange());
        }
    }
    return randomFruitsArray;
}
}
