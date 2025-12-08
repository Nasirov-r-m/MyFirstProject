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

        int humanAge = 6;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад!");
        } if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека " + humanAge + ", то ему нужно ходить в школу!");

        }if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет!");
        } if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходит на работу!");
        }

        // Задание 5

        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе!");
        }
        if (ageChild >= 5 && ageChild <= 14) {
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
    //Задача 1

        int one = 1;
        byte two = 2;
        short three = 3;
        long four = 4;
        float five = 1.5f;
        double six = 5.5;

        System.out.println("Значение переменной one с типом int равно " + one );
        System.out.println("Значение переменной two с типом byte равно " + two );
        System.out.println("Значение переменной one с типом short равно " + three );
        System.out.println("Значение переменной one с типом long равно " + four );
        System.out.println("Значение переменной one с типом float равно " + five );
        System.out.println("Значение переменной one с типом double равно " + six );

    // Задача 2
        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

    //Задача 3

        byte lydmilaPetrovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;

        short paper = 480;

        int student = (lydmilaPetrovna + annaSergeevna + ekaterinaAndreevna);
        int everyOneStudent = paper / student;

        System.out.println("На каждого ученика расчитано " + everyOneStudent + " листов бумаги.");

    //Задача 4

        byte performance = 16;

        byte min20 = 20;
        short oneDay = (24*60);
        short threeDays = (24*3)*60;
        int oneMonth = (24*30)*60;

        int performanceMin20 = (min20*16)/2;
        int performanceOneDay = (oneDay*16)/2;
        int performanceThreeDay = (threeDays*16)/2;
        int performanceOneMonth = (oneMonth*16)/2;

        System.out.println("За 20 минут машина произвела " + performanceMin20 + " штук бутылок.");
        System.out.println("За один день машина произвела " + performanceOneDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + performanceThreeDay + " штук бутылок.");
        System.out.println("За месяц машина произвела " + performanceOneMonth + " штук бутылок.");

    //Задача 5

        byte schoolRenovation = 120;
        byte oneClassDye = 6;

    //Всего классов

        int totalClassSchool = schoolRenovation / oneClassDye;

    //Каждой краски

        int whiteDye = totalClassSchool * 2;
        int brownDye = totalClassSchool * 4;

        System.out.println("В школе, где " + totalClassSchool + " класснов, нужно " + whiteDye + " банок белой краски и " + brownDye +" банок коричневой краски." );


    // Задача 6

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte egg = 4;

        int bananasGrams = 5*80;
        int milkGrams = 2*105;
        int iceCreamGrams = 2*100;
        int eggGrams = 4*70;

        int breakfastGrams = bananasGrams + milkGrams + iceCreamGrams + eggGrams;
        System.out.println(breakfastGrams);

    // Вес завтрака в граммах

        System.out.println( "Вес завтрака равен " + breakfastGrams + " граммов.");

    // Вес завтрака в КГ

        float breakfastKg = breakfastGrams / 1000F;

        System.out.println("Вес завтрака равен " + breakfastKg + " килограмм");


    //Задача 7

        byte needToResetKg = 7;
        short needToResetGrams = 7*1000;
        short grams250 = 250;
        short grams500 = 500;

        int reset250Grams = needToResetGrams / 250;
        System.out.println(reset250Grams);

        int reset500Grams = needToResetGrams /500;
        System.out.println(reset500Grams);

        int dayOnAverage = (reset250Grams+reset500Grams)/2;

        System.out.println(reset250Grams + " дней уйдет на похудение, если спортсмен будет терять по 250 гр. в день.");
        System.out.println(reset500Grams + " дней уйдет на похудение, если спортсмен будет терять по 500 гр. в день.");
        System.out.println("Чтобы добиться результа похудения, в среднем может потребоваться " + dayOnAverage + " день.");


    //Задача 8

        //ЗП Сотрудников в месяц

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        // ЗП Сотрудников + 10%

        float newSalaryMasha = salaryMasha * 1.1F;
        float newSalaryDenis = salaryDenis * 1.1F;
        float newSalaryKristina = salaryKristina * 1.1F;

        System.out.println(newSalaryMasha);
        System.out.println(newSalaryDenis);
        System.out.println(newSalaryKristina);

        //Разница ЗП до и после повышения

        float salaryDifferenceMasha = newSalaryMasha - salaryMasha;
        float salaryDifferenceDenis = newSalaryDenis - salaryDenis;
        float salaryDifferenceKristina = newSalaryKristina - salaryKristina;

        System.out.println(salaryDifferenceMasha);
        System.out.println(salaryDifferenceDenis);
        System.out.println(salaryDifferenceKristina);

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей.");

















































    }

}