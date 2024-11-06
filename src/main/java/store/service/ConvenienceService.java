package store.service;

import store.model.Product;
import store.model.Promotion;

import java.util.List;

public interface ConvenienceService {
    List<Product> getProducts();
    List<String> getProductsFromFile();
    Product covertStringToProduct(String aLine);

    Promotion checkPromotion(String type);
}
