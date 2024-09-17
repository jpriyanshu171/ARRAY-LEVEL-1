import java.util.Scanner;

public class ques12 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter array size:");
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                              a[i] = sc.nextInt();
                    }
                    int evenCount = 0;
                    int sum = 0;
                    float average = 0;
                    for (int i = 0; i < n; i++) {
                              if (a[i] % 2 == 0) {
                                        evenCount++;
                                        sum = sum + a[i];
                              }
                    }
                    average = (float) sum / evenCount;
                    System.out.println("Sum of even numbers in array is = " + average);
          }
}
