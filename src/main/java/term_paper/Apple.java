package term_paper;

public class Apple extends Fruit{
    boolean waxTreatment;
    boolean sidrReady;

    public Apple(long weight, String sort, boolean waxTreatment, boolean sidrReady) {
        super(weight, sort);
        this.waxTreatment = waxTreatment;
        this.sidrReady = sidrReady;
    }

    @Override
    public String toString() {
        return "Apple" + "\n" + "{" + "\n" +
                "sort = " + sort +
                ", \n" + "weight = " + weight +
                ", \n" + "waxTreatment=" + waxTreatment +
                ", \n" + "sidrReady=" + sidrReady +  "\n" +
                '}';
    }
}
