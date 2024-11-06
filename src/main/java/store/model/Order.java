package store.model;

public class Order {
    public record OrderItem(
            String name,
            int cnt
    ){}
}
