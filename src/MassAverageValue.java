import java.util.Scanner;
public class MassAverageValue {


    /*
      Создать и заполнить одномерный массив интов. Написать программу для вычисления среднего значения массива
     */



    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();
         int[] x = new int[n];

        for (int i = 0; i < x.length; i++) { //  на i < x.length можно заменить i < n и тогда не будет работать
            x[i] = scanner.nextInt();
        }
        scanner.close();
        int z=0;
        for (int i=0; i<x.length; i++){

                z=z+x[i];

        }
        int y=z/n;
        System.out.println(y);
    }
}
