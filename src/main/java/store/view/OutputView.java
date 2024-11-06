package store.view;

import store.model.Product;

import java.util.List;

public class OutputView {
    public void printInfo(List<Product> products) {
        printGreetings();
        System.out.println();
        printProduct(products);
    }

    public void printGreetings(){
        System.out.println("안녕하세요. W편의점입니다.");
        System.out.println("현재 보유하고 있는 상품입니다.");
    }

    public void printProduct(List<Product> products){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
