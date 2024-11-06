package store.service;

import store.model.Order.OrderItem;
import store.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputServiceImpl implements InputService{

    private final String ERROR_MESSAGE = "[error]";

    public List<OrderItem> stringToList(String menuLine, List<Product> products){
        List<OrderItem> orders = new ArrayList<>();

        List<String> menus = Arrays.stream(menuLine.split(",")).toList();
        for(String menu: menus){
            OrderItem tmp = stringToOrderItem(menu);
            if(!isInProduct(tmp, products)) throw new IllegalArgumentException(ERROR_MESSAGE+" 주문한 상품이 메뉴에 없음.");
            orders.add(tmp);
        }
        return orders;
    }

    public boolean isInProduct(OrderItem orderItem, List<Product> products){
        for(Product product : products){
            if(orderItem.name().equals(product.getName())) return true;
        }
        return false;
    }

    public OrderItem stringToOrderItem(String menuLine){
        checkForm(menuLine);
        List<String> menu = Arrays.stream(menuLine.split("-")).toList();
        String str1 = menu.get(0);
        String str2 = menu.get(1);

        str1 = str1.substring(1,str1.length());
        str2 = str2.substring(0,str2.length()-1);
        isNum(str2);

        return new OrderItem(str1,Integer.parseInt(str2));
    }

    public void checkForm(String menuLine){
        if(!(menuLine.startsWith("[") && menuLine.endsWith("]"))) throw new IllegalArgumentException(ERROR_MESSAGE+" 형식이 올바르지 않습니다.");
    }

    public void isNum(String str){
        if (!str.matches("[+-]?\\d*(\\.\\d+)?")) throw new IllegalArgumentException(ERROR_MESSAGE+" 입력이 숫자가 아님");
    }
}
