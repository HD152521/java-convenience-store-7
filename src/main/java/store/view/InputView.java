package store.view;

import store.model.Order.OrderItem;
import store.model.Product;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import store.service.InputServiceImpl;

public class InputView {

    InputServiceImpl inputService = new InputServiceImpl();

    public void getMenu(List<Product> products){
        System.out.println("구매하실 상품명과 수량을 입력해 주세요. (예: [사이다-2],[감자칩-1])");
        String menuLine = Console.readLine();

        List<OrderItem> orders = inputService.stringToList(menuLine,products);
        for(OrderItem order : orders){
            System.out.println(order.toString());
        }
    }

    public void idMembership(){
        System.out.println("멤버십 할인을 받으시겠습니까? (Y/N)");
    }

    public void buyAgain(){
        System.out.println("감사합니다. 구매하고 싶은 다른 상품이 있나요? (Y/N)");
    }

    public void noPromotion(){
        System.out.println("현재 콜라 4개는 프로모션 할인이 적용되지 않습니다. 그래도 구매하시겠습니까? (Y/N)");
    }

    public void canPromotion(){
        System.out.println("현재 오렌지주스은(는) 1개를 무료로 더 받을 수 있습니다. 추가하시겠습니까? (Y/N)\n");
    }

}
