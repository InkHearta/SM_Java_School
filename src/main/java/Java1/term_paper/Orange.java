package Java1.term_paper;

public class Orange extends Fruit{
    long peelThickness;
    long numberOfSlices;

    public Orange(long weight, String sort, long peelThickness, long numberOfSlices) {
        super(weight,sort);
        this.peelThickness = peelThickness;
        this.numberOfSlices = numberOfSlices;
    }

    @Override
    public String toString() {
        return "Orange" + "\n" + "{" + "\n" +
                "sort = " + sort +
                ", \n" + "weight = " + weight +
                ", \n" + "peelThickness=" + peelThickness +
                ", \n" + "numberOfSlices=" + numberOfSlices +  "\n" +
                '}';
    }
}
