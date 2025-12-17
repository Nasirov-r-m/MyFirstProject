import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

       int arrayOne [] = {1,2,3};
       float arrayTwo [] = {1.57f, 7.654f, 9.986f};
       int arrayThree[] = new int [5];
       arrayThree[0] = 10;
       arrayThree[1] = 20;
       arrayThree[2] = 30;
       arrayThree[3] = 40;
       arrayThree[4] = 50;

        // Задание 2

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

        // Задание 3
        // arrayOne

        for (int i = arrayOne.length - 1; i >=0; i-- ) {
            System.out.print(arrayOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(""); // прописал пустой вывод, потому, что arrayOne
        // и arrayTwo выводились в одну строку.


        // arrayTwo
        for ( int a = arrayTwo.length - 1; a >=0; a--) {
            System.out.print(arrayTwo[a]);
            if (a  != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("");

        // arrayThree

        for ( int b = arrayThree.length -1; b >= 0; b--){
            System.out.print(arrayThree[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");


        // Задание 4

        for (int c = 0; c < arrayOne.length; c++) {
            if (arrayOne[c] %2 != 0)
                arrayOne[c] ++;
        }
        System.out.println(Arrays.toString(arrayOne));










    }
}
