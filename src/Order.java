import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order other = (Order) o;

        if (!Objects.equals(customer, other.customer)) return false;
        if (basket == null && other.basket == null) return true;
        if (basket == null || other.basket == null) return false;
        if (basket.length != other.basket.length) return false;

        for (int i = 0; i < basket.length; i++) {
            if (!Objects.equals(basket[i], other.basket[i])) {
                return false;
            }
        }
        return true;
    }
}


