import java.util.Scanner;

public class ques9 {
          public static void bubbleSort(int a[]) {
                    for (int i = 0; i < a.length - 1; i++) {
                              for (int j = 0; j < a.length - 1 - i; j++) {
                                        if (a[j] > a[j + 1]) {
                                                  int temp = a[j];
                                                  a[j] = a[j + 1];
                                                  a[j + 1] = temp;
                                        }
                              }
                    }
          }

          public static void display(int a[]) {
                    for (int i = 0; i < a.length; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter 10 numbers:");
                    int a[] = new int[10];
                    int n = 10;
                    for (int i = 0; i < 10; i++) {
                              a[i] = sc.nextInt();
                    }
                    System.out.println("Array before sorting = ");
                    display(a);
                    bubbleSort(a);
                    System.out.println("Array after sorting = ");
                    display(a);

          }
}
