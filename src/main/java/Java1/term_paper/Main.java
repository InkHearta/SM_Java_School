package Java1.term_paper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>(RandomUtils.randomFruits());
        System.out.println(fruits.toString()); //создали кучу фруктов

        CityStorage storage1 = new CityStorage(); //создали склад
        Shop shop1 = new Shop(); //создали магазин 1
        Shop shop2 = new Shop(); //создали магазин 2
        storage1.addFruitsToCityStorage(fruits); //положили фрукты на склад
        System.out.println(storage1.toString()); // вывели данные склада
        System.out.println(shop1.toString());// вывели магазин 1
        System.out.println(shop2.toString());// вывели магазин 2
        System.out.println("########################################");
        shop1.addArrayFruitsToShop(storage1.shopSupply(shop1, 2)); //отгрузили 2 фрукта в магазин 1
        shop2.addArrayFruitsToShop(storage1.shopSupply(shop2, 3)); //отгрузили 2 фрукта в магазин 2
        System.out.println(storage1.toString());// вывели склад после вывоза фруктов
        System.out.println("########################################");
        System.out.println(shop1.toString());// вывели магазин 1
        System.out.println("########################################");
        System.out.println(shop2.toString());// вывели магазин 2

    }
}
