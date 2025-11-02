import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //создание товаров
        Product product1 = new Product(1, "ручка", 20, "канцтовары");
        Product product2 = new Product(2, "карандаш", 15, "канцтавары");
        Product product3 = new Product(3, "линейка", 12, "канцтовары");
        Product product4 = new Product(1, "ручка", 20, "канцтовары");
        //сравнение товаров
        if (product1.equals(product4)) {
            System.out.println("объекты одинаковые");
        } else {
            System.out.println("объекты не одинаковые");
        }
        //создание массива с заказами
        Order order1 = new Order("Мария", new Product[]{product2, product3});
        Order order2 = new Order("Алексей", new Product[]{product2, product4});
        Order order3 = new Order("Дмитрий", new Product[]{product1, product2});
        Order order4 = new Order("Сергей", new Product[]{product1, product3});
        Order order5=new Order("bbbhb", new Product[]{});

       if(order1.equals(order1)){
           System.out.println("равны");
       } else {
           System.out.println("не равны");
       }

    }
}

