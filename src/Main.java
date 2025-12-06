import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main (String[] args) {

        // Задание 1

        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " значит он совершеннолетний!");
        }else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать!");
        }

        // Задание 2

        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку! ");
        }else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }

        // Задание 3

        int speed = 53;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф!");
        }else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно!");
        }

        // Задание 4

        int humanAge = 10;
        if (humanAge > 2 && humanAge < 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад!");
        } if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека " + humanAge + ", то ему нужно ходить в школу!");

        }if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет!");
        } if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходит на работу!");
        }

        // Задание 5

        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе!");
        }
        if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе только в сопровождении взрослого!");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого!" );
        }

        // Задание 6

        int passengers = 103;
        int carriageCapacity = 102;
        int seatedPassengers = 60;
        if (passengers < seatedPassengers) {
            System.out.println("В вагоне есть сидячие места!");
        }
        if (passengers >seatedPassengers && passengers < carriageCapacity) {
            System.out.println("В вагоне есть стоячие места!");
        }
        if (passengers > carriageCapacity) {
            System.out.println("Вагон полностью забит!");
        }

        // Задание 7

        int one = 100;
        int two = 60;
        int three = 90;

        if (one > two && one > three) {
            System.out.println(one + " наибольшее число!");
        }

        if (two > one && two > three) {
            System.out.println(two + " наибольшее число");
        }

        if (three >one && three > two) {
            System.out.println(three + " наибольшее число");
        }


    }

}