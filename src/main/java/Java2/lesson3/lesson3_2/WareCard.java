package Java2.lesson3.lesson3_2;

public class WareCard {
    public String name;//    название товара
    public double fullPrice;//    цена до скидки
    public double discount;//    процент скидки
    public double discountedPrice; //    цена после скидки

    public WareCard(String name, double fullPrice, double discount) {
        this.name = name;
        this.fullPrice = fullPrice;
        this.discount = discount;
        this.discountedPrice = fullPrice / (1 + discount /100);
    }

    @Override
    public String toString() {
        return "На " + name + " твоя персональная скидка - " + discount + "! " +
                "Старая цена: " + fullPrice + ", твоя новая цена: " + Math. round(discountedPrice* 100.0)/100 + ". Удачных покупок!";
    }

}
