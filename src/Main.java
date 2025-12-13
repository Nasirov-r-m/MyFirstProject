import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        int firstFriday = 3;
        for (int day = firstFriday; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет");
        }

        // Задание 2

        // Задание 2.1

        int distance = 42_195;
        int reminder = 500;

        do {
            System.out.println("Держись, осталось " + distance);
            distance = distance - reminder;

        } while (distance >= 0);


        // Задание  2.2

        for (int passed = 0; passed <= 42195; passed = passed + 500) {
            // использовал цифры вместо переменной, потому, что с переменной идея не запускала второй вариант.
            int finish = 42195 - passed;
            System.out.println("Держить, осталось, " + finish + " метров");
        }

        // Задание 3

        // Задание 3.1

        int money = 1000;
        int day = 0;

        while (money >= 100) {

            day++;
            money = money - 100;
            if (day % 5 == 0) {
                money = money + 100;
                System.out.println("Сегодня " + day + " день, парковка БЕСПЛАТНО ");
                continue;
            }
            System.out.println("Сегодня " + day + " день парковки, остаток средств " + money);


        }

        // Задание 3.2

        int balance = 1000;
        int days = 0;

        for (; balance >= 0; balance = balance - 100) {
            days++;

            if (days % 5 == 0) {
                System.out.println("Сегодня " + days + " день, парковка БЕСПЛАТНАЯ");
                balance = balance + 100;
                continue;
            }

            System.out.println(days + " день парковки. Остаток средств " + balance);
        }


        // Задание 4

        int month = 0;
        double total = 0;
        while (total < 12_000_000) {
            month++;
            total = total + 15_000;

            if (month % 6 == 0) {
                total = total * 1.07;
            }
            {
                // Строчку вывода в консоль, скопировал из " Обсуждения домашки"  честно признаю..
                // не понимаю... Подскажи, пожалуйста.
                System.out.printf("Месяц %d, сумма накоплений %.2f рублей%n ", month, total);


                }
            }

        // Задание 5

        // Привет Наставник!
        // Подскажи, пожалуйста, что не так?

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                System.out.println(" Случился перегрев "+ overheats + ". Зарядка приостановленна. Заряд " + charge + "%" );
                if (overheats == 3) {
                    break;
                }
                continue;
            }


            System.out.println(" Текущий заряд "+ charge +" % ");




        }






    }
}
