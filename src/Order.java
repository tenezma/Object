import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket != null ? Arrays.copyOf(basket, basket.length) : new Product[0];
    }

    @Override
    public String toString() {
        return "покупатель " + customer + " сделал заказы на следующие товары: " + Arrays.toString(basket);

    }
}




