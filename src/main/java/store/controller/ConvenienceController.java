package store.controller;

import store.model.Product;
import store.service.ConvenienceServiceImpl;
import store.view.InputView;
import store.view.OutputView;

import java.util.List;

public class ConvenienceController {

    ConvenienceServiceImpl convenienceService = new ConvenienceServiceImpl();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void start(){
        try{
            List<Product> products = convenienceService.getProducts();
            outputView.printInfo(products);
            inputView.getMenu(products);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
