import java.util.Scanner;
public class MassInverse {

    /*
       Написать программу для перестановки элементов массива в обратном порядке
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
        for (int i = 0; i < y.length; i++) {
            y[i]=x[x.length -1 - i];
            System.out.println(y[i]);
        }
    }
}
