import java.util.Scanner;
public class Mass2Copy {

    /*
      Написать программу для копирования значений одного массива в другой
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < x.length; i++) {
               y[i]=x[i];
           System.out.println(y[i]);
        }
    }
}