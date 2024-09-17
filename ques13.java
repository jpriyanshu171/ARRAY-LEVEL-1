import java.util.Scanner;

public class ques13 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter array size:");
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                              a[i] = sc.nextInt();
                    }
                    int largest = a[0];
                    int smallest = a[0];
                    for (int i = 0; i < n; i++) {
                              if (a[i] > largest) {
                                        largest = a[i];
                              }
                              if (a[i] < smallest) {
                                        smallest = a[i];
                              }
                    }
                    System.out.println("Largest = " + largest);
                    System.out.println("Smallest = " + smallest);

          }
}
