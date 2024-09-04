package term_paper;

import java.util.ArrayList;

public class CityStorage {
    private ArrayList<Fruit> fruitsOnCityStorage = new ArrayList<>();
    private ArrayList<Fruit> fruitsForShop = new ArrayList<>();

    //метод позволяющий добавить массив объектов Fruit в список фруктов объекта CityStorage
    public void addFruitsToCityStorage(ArrayList<Fruit> fruit) {
        int capacityCityStorage = fruit.size(); //размер склада под новые фрукты
        for (int i = 0; i < capacityCityStorage; i++) {
            fruitsOnCityStorage.add(fruit.get(i));
        }
    }
    //метод позволяющий отгрузить фрукты в магазин
    public ArrayList<Fruit> shopSupply(Shop shop, int amountOfFruits){
        int capacityCityStorage = fruitsOnCityStorage.size(); //размер склада c фруктами
        if(amountOfFruits < capacityCityStorage)
            {
            fruitsForShop.clear();
            for (int i = 0; i < amountOfFruits; i++) {
                fruitsForShop.add(fruitsOnCityStorage.get(i));
                fruitsOnCityStorage.remove(fruitsOnCityStorage.get(i));
                };
            return fruitsForShop;
            }
        else System.out.println("на складе нет столько фруктов");
    return null;
}

    //переопределенный метод toString, представляющий данные всех полей одной строкой
    @Override
    public String toString() {
        return "CityStorage{" +  "\n" +
                "fruits=" + fruitsOnCityStorage + "\n" +
                '}';
    }
}