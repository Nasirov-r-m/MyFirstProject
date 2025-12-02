public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World");
        System.out.println("Привет Мир!");
        //Значение переменных
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = (dog + 4);
        cat = (cat + 4);
        paper = (paper + 4);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = (dog - 3.5);
        cat = (cat - 1.6);
        paper = (paper - 7639);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog +4;
        System.out.println(frog);
//Вес боксеров
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;

        System.out.println("Общий вес боксеров " + totalWeight + " кг!" );

        var wightDifference = boxerOne - boxerTwo;
        System.out.println("Разница между массами бойцов " + wightDifference + " КГ!");

        wightDifference = boxerTwo % boxerOne;
        System.out.println("Разница между массами бойцов " + wightDifference + " КГ!");

 // Сотрудники компании

        var openingHours = 640;
        var oneEmployee = 8;
        var totalPeople = openingHours / oneEmployee;

        System.out.println("Всего работников в компании " + totalPeople +" человек!");

        var morePeople = totalPeople + 94;
        System.out.println(morePeople);

        var openingHoursMore = morePeople * oneEmployee;
        System.out.println(openingHoursMore);

        System.out.println("Если в компании работает " + morePeople + " человека, то всего " + openingHoursMore + " часов работы может быть поделено между сотрудниками");












    }

}