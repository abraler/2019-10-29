import java.util.Comparator;

public class nameCompare implements Comparator<books> {
    @Override
    public int compare(books o1, books o2) {
        return o1.name.compareTo(o2.name);
    }
}
