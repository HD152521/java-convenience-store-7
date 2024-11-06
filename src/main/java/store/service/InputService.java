package store.service;

import store.model.Order.OrderItem;
import store.model.Product;

import java.util.List;

public interface InputService {
    List<OrderItem> stringToList(String menuLine, List<Product> products);
    OrderItem stringToOrderItem(String menuLine);
    void isNum(String str);
    boolean isInProduct(OrderItem orderItem,List<Product> products);
}
