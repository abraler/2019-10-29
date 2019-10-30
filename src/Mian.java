import java.util.ArrayList;
import java.util.List;

public class Mian {

    public static void main(String[] args) {
        List<books> list=new ArrayList<>();

        list.add(new books("12345","java","冯志祥",12));
        list.add(new books("12323","c++","孔祥胜",13));
        list.add(new books("12365","python","袁国忠",11));
        list.add(new books("12332","go","汪洋",19));
        list.add(new books("12399","c","徐斌",7));
        List<books> book;
        System.out.println("按ISBN排序");
        book=new ArrayList<>(list);
        Sort.sort(book);
        for (int i = 0; i <book.size() ; i++) {
            System.out.println(book.get(i));
        }
        System.out.println("=================");
        System.out.println("按名字排序");
        book=new ArrayList<>(list);
        Sort.sort2(book, new nameCompare());
        for (int i = 0; i <book.size() ; i++) {
            System.out.println(book.get(i));
        }
        System.out.println("=================");
        System.out.println("按价格排序");
        book=new ArrayList<>(list);
        Sort.sort2(book,new priceCompare(true));
        for (int i = 0; i <book.size() ; i++) {
            System.out.println(book.get(i));
        }
    }
}
