import java.util.*;

public class ques10 {
          public static void selectionSort(int a[]) {
                    for (int i = 0; i < a.length - 1; i++) {
                              int min = i;
                              for (int j = i + 1; j < a.length; j++) {
                                        if (a[j] < a[min]) {
                                                  min = j;
                                        }
                              }
                              int temp = a[min];
                              a[min] = a[i];
                              a[i] = temp;
                    }
          }

          public static void display(int a[]) {
                    for (int i = 0; i < 10; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int a[] = new int[10];
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++) {
                              a[i] = sc.nextInt();
                    }
                    System.out.println("Array before sorting = ");
                    display(a);
                    selectionSort(a);
                    System.out.println("Array after sorting = ");
                    display(a);
          }
}
