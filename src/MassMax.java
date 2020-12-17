import java.util.Scanner;
public class MassMax {
    /*
      Создать и заполнить одномерный массив интов. Написать программу для поиска максимального значения в массиве
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();
         int[] x = new int[n];

        for (int i = 0; i < n; i++) { // i < n можно заменить на i < x.length
            x[i] = scanner.nextInt();
        }
        scanner.close();
 int max =0;
 for (int i=0; i<x.length; i++){
     if (x[i]>max){
         max=x[i];
     }
 }
 System.out.println(max);
    }
}
