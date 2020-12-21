import java.util.Scanner;
public class TwoDimensionalMassMultiply {

    /*
       Двумерные массивы. Написать программу для умножения двух матриц
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерость матрицы А:");
        int aLine = scanner.nextInt();
        int aColumn = scanner.nextInt();

        System.out.println("Введите размерость матрицы B:");
        int bLine = scanner.nextInt();
        int bColumn = scanner.nextInt();

        if (aColumn == bLine){
            int a[][] = new int[aLine][aColumn];
            int b[][] = new int[bLine][bColumn];
            int x[][] = new int[aLine][bColumn];

            System.out.println("Введите элементы матрицы А");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Введите элементы матрицы B ");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            scanner.close();
            System.out.print("Матрица А:");
            for (int i = 0; i < a.length; i++) {
                System.out.println("");
                for (int j = 0; j < a[0].length; j++) {
                    System.out.printf("%10d ", a[i][j]);
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.print("Матрица B:");
            for (int i = 0; i < b.length; i++) {
                System.out.println("");
                for (int j = 0; j < b[0].length; j++) {
                    System.out.printf( "%10d ",b[i][j]);
                }
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int n = 0; n < a[0].length; n++) {
                        x[i][j] = x[i][j] + a[i][n] * b[n][j];
                    }
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.print("Результат A*B:");
            for (int i = 0; i < a.length; i++) {
                System.out.println("");
                for (int j = 0; j < b[0].length; j++) {
                    System.out.printf("%10d ", x[i][j]);
                }
            }
        } else {
            System.out.println("Такие матрицы перемножить нельзя. " +
                    "Число столбцов матрицы А должно быть равно числу строк матрицы В");
        }

    }
}
