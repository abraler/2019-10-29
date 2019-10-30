import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void sort (List<books>list){
        for (int i = 1; i <list.size() ; i++) {
            books a=list.get(i);
            int j=i-1;
           // for (; j>=0&&(list.get(i).ISBN.compareTo(list.get(j).ISBN)<0); j--) {
            for (; j>=0&&(a.ISBN.compareTo(list.get(j).ISBN)<0); j--) {
                list.set(j+1,list.get(j));
            }
            list.set(j+1,a);
        }
    }
    public static void sort2(List<books>list, Comparator comparator){
        for (int i = 0; i <list.size() ; i++) {
            books a=list.get(i);
            int j=i-1;
            for (; j >=0&&comparator.compare(list.get(j),a)>0;j--) {
                list.set(j+1,list.get(j));
            }
            list.set(j+1,a);
        }
    }
}
