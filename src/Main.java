import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Product macbook = new Product(1, "Макбук", 100_000, "Электроника");
        Product mouse = new Product(1, "Макбук", 100_000, " Электроника");
        Product headphones = new Product(3, "Наушники", 15000, "Периферия");

        System.out.println(macbook);
        System.out.println(mouse);
        System.out.println(headphones);
        System.out.println(macbook.equals(mouse));
        System.out.println(headphones.equals(mouse));
Product[] products = {macbook, mouse, headphones};
Order ruslan = new Order("Руслан", products);
        System.out.println(ruslan);


    }
}
