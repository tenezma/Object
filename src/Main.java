import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Product one = new Product(1, "ручка", 20, "канцтовары");
        Product two = new Product(2, "карандаш", 15, "канцтавары");
        Product three = new Product(3, "линейка", 12, "канцтовары");
        Product one1 = new Product(1, "ручка", 20, "канцтовары");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


        if (one.equals(one1)) {
            System.out.println("объекты одинаковые");
        } else {
            System.out.println("объекты не одинаковые");
        }


    }
}

