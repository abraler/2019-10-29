import java.util.Comparator;

public class priceCompare implements Comparator<books> {
    boolean asc;

    public priceCompare(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(books o1, books o2) {
        if(true){
            return (int)(o1.price-o2.price);
        }
        return (int)(o2.price-o1.price);

    }
}
