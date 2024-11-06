package store.service;

import store.model.Product;
import store.model.Promotion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvenienceServiceImpl implements ConvenienceService{
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();

        List<String> productsByFile = getProductsFromFile();
        productsByFile.remove(0);
        for(String line: productsByFile) {
            products.add(covertStringToProduct(line));
        }
        return products;
    }

    public List<String> getProductsFromFile(){
        List<String> aLines = new ArrayList<String>();
        try{
            File aText = new File("src/main/resources/products.md");
            FileReader aReader = new FileReader(aText);
            BufferedReader aBufReader = new BufferedReader(aReader);
            String aLine = "";

            while((aLine = aBufReader.readLine()) != null) {
                aLines.add(aLine);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return aLines;
    }

    public Product covertStringToProduct(String aLine) {
        List<String> elements = Arrays.stream(aLine.split(",")).toList();
        int price = Integer.parseInt(elements.get(1));
        int cnt = Integer.parseInt(elements.get(2));
        Promotion promotion = checkPromotion(elements.get(3));

        Product product = new Product(elements.get(0),price,cnt,promotion);

        return product;
    }

    public Promotion checkPromotion(String type){
        Promotion p = null;
        for(Promotion promotion : Promotion.values()){
            if(type.equals(promotion.getType())) p = promotion;
        }
        return p;
    }

}
