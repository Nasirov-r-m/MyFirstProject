import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] inputArray1 = {500, 200, 100, 1000, 2000};
        int sum = 0;
        float middle = 0;
        int max = 0;
        int min = inputArray1[0];
        System.out.println(Arrays.toString(inputArray1));

        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] < min) {
                min = inputArray1[i];
            }
        }


        for (int money : inputArray1) {
            sum += money;
            if (money > max) {
                max = money;
            }

        }
        middle = (float) sum / inputArray1.length;
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(middle);

        float[] outputArray1 = new float[4];
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = middle;

        System.out.println(Arrays.toString(outputArray1));

        // Задание 2

        int [] inputArray2 = {50_000,100_000, 150_000, 200_000, 250_000};
        int newMeaning = 0;
        double [] outputArray2 = new double[5];
        System.out.print("ЗП сотрудников ");
        System.out.println(Arrays.toString(inputArray2));

        for (double pay : inputArray2) {
            double tax = pay * 0.13d;
            outputArray2[newMeaning] = tax;
            newMeaning++;

        }
        System.out.print("Налог на каждую ЗП ");
        System.out.println(Arrays.toString(outputArray2)); // Налог на каждую ЗП


        // Задание 3

        int [] inputArray3 = {2000,1000,6000,7000,8000};
        boolean [] outputArray3 = new boolean[5];

        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;

            }else  {
                outputArray3[i] = false;
            }
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        // Задание 4

        int [] inputArray4 = {-100,200,300,400,500};
        boolean outputArray4 = true;

        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] <  0 ){
                outputArray4 = false;
                break;
            }else {
                outputArray4 = true;
            }

        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);

        // Задание 5

        int [] inputArray5 = {10_000, 20_000, -5000, -10_000, 0};
        int [] outputArray5 = new int [1];
         int sumMonth = 0;
        System.out.println(Arrays.toString(inputArray5));

        for (int element : inputArray5) {
            if (element > 0) {
                sumMonth++;
           }
        }
        outputArray5[0] = sumMonth;
        System.out.println(Arrays.toString(outputArray5) + " - количество месяцев с прибылью");








































    }
}
