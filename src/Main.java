import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        leapYear(2024);

        System.out.println("Задание 2");
        softOs(2016, 1);

        System.out.println("Задание 3");
        calculationOfDelivery(101);



    }
    // Задание 1
    public static void leapYear (int year){
        if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println(year + " год - високосный год");
        }else {
            System.out.println(year + " год - невысокосный год");
        }
    }

    // Задание 2

    public static void softOs (int deviceYear, int clientOs) {
        if (deviceYear<2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }else if (deviceYear<2015 && clientOs ==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (deviceYear>=2015 & clientOs==0) {
            System.out.println("Установите обычную версию приложения для IOS");
        }else if (deviceYear>=2015 && clientOs ==1){
            System.out.println(" Установите обычную версию приложения для Android");

        }
    }

    // Задание 3
    public static int calculationOfDelivery (int diliveryDistance) {
        int deliveryDays = 1;
        if (diliveryDistance >= 0 && diliveryDistance <= 20) {
            System.out.println("Дней доставка : " + deliveryDays);
            return deliveryDays;
        } else if (diliveryDistance > 20 && diliveryDistance <= 60) {
            deliveryDays += deliveryDays;
            System.out.println("Дней доставка : " + deliveryDays);
            return deliveryDays;
        } else if (diliveryDistance > 60 && diliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Дней доставка : " + deliveryDays);
            return deliveryDays;
        } else if (diliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет!");
        }
        return -1;
    }


}
