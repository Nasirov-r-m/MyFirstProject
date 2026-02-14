import java.util.Arrays;

public class Order {
    private String customer;
    private Product [] basket;

    public Order (String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }
    public String toString(){
        return "Покупатель: " + customer + " " + Arrays.toString(basket);

    }
}
