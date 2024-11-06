package store.model;

public class Product {
    private String name;
    private int price;
    private int cnt;
    private Promotion promotion;

    public Product(String name, int price, int cnt, Promotion promotion){
        this.name = name;
        this.price = price;
        this.cnt = cnt;
        this.promotion = promotion;
    }

    public Promotion getPromotion() {
        return promotion;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cnt=" + cnt +
                ", promotion=" + promotion +
                '}';
    }
}
