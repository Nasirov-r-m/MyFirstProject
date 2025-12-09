import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {

        // Задание 1 / 2

        int clientOs = 0;
        int ios = 0;
        int android = 1;
        int clientDeviceYear = 2014;

        if (clientOs == ios && clientDeviceYear <= 2015) {

            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == ios && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == android && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else if (clientOs == android && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android");
        }

        // Задание 3

        int year = 2024;
        if (year < 1584) {
            System.out.println("Год не является высокосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }

        // Задание 4

        int deliveryDistance = 95;
        int term = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + term);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (term + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (term + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }

        // Задание 5

        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;

            case 2:
                System.out.println("Сейчас зима");
                break;

            case 3:
                System.out.println("Сейчас весна");
                break;

            case 4:
                System.out.println("Сейчас весна");
                break;

            case 5:
                System.out.println("Сейчас весна");
                break;

            case 6:
                System.out.println("Сейчас лето");
                break;


            case 7:
                System.out.println("Сейчас лето");
                break;

            case 8:
                System.out.println("Сейчас лето");
                break;

            case 9:
                System.out.println("Сейчас осень");
                break;

            case 10:
                System.out.println("Сейчас осень");
                break;

            case 11:
                System.out.println("Сейчас осень");
                break;

            case 12:
                System.out.println("Сейчас зима");
                break;

            default:
                System.out.println("Ошибка");

        }
    }
}