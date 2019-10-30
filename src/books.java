public class books {
    String ISBN;//编号
    String name;// 名字
    String author;//作者
    double price;//价格

    public books(String ISBN, String name, String author, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "books{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
