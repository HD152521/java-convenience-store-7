package store.controller;

import store.model.Product;
import store.service.ConvenienceServiceImpl;

import java.util.List;

public class ConvenienceController {

    ConvenienceServiceImpl convenienceService = new ConvenienceServiceImpl();

    public void start(){
        List<Product> products = convenienceService.getProducts();
        for(Product product : products){
            System.out.println(product.toString());
            System.out.println(product.getPromotion().toString());
        }
    }
}
