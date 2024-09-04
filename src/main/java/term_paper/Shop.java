package term_paper;

import java.util.ArrayList;

public class Shop {
    String adress;
    ArrayList<Fruit> fruitsOnShop = new ArrayList<Fruit>();

//- метод позволяющий добавить объект Fruit в массив объекта Shop
public void addFruitToShop(Fruit fruit){
    fruitsOnShop.add(fruit);
}
//- метод позволяющий добавить список объектов Fruit в массив объекта Shop
public void addArrayFruitsToShop(ArrayList<Fruit> fruits){
    fruitsOnShop.addAll(fruits);
}
//- переопределенный метод toString, представляющий данные всех полей одной строкой
@Override
public String toString() {
    return
            "Shop {" +  "\n" +
            "adress =" + adress + "\n" +
            "fruits on Shop = " + "\n" + fruitsOnShop + "\n" +
            '}';
    }
}
