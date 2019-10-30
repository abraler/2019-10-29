//这个只是查看类型强转
public class Exercise1 {
    public static void main(String[] args) {
        double a=2.999;
        double b=-1.222;
        double c=-0.66;
        double d=-0.99999;


        int s=(int )a;
        System.out.println("0.2     "+s);
        s=(int )b;
        System.out.println("-1.222  "+s);
        s=(int)c;
        System.out.println("-0.66    "+s);
        s=(int)d;
        System.out.println("-0.1      "+s);
    }
}
