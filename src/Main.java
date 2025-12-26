import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф.И.О. сотрудника - " + String.format(fullName));

        // Задание 2

        String fullName1 = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника для заполнения отчета - " + String.format(fullName1));

        // Задание 3

        String fullName2  = "Иванов Семён Семёнович";
        String name2 = fullName2.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника - " + String.format(name2));









    }
}
