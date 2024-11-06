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

    public String getName(){
        return name;
    }

    public Promotion getPromotion() {
        return promotion;
    }


    @Override
    public String toString() {
        String str = "-" + name + " " + price +"원 "+ cnt +"개 ";
        if(!promotion.getType().equals("null")){
            str += promotion.getType();
        }
        return str;
    }
}
