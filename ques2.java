import java.util.Scanner;

public class ques2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter array size:");
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                              a[i] = sc.nextInt();
                    }
                    System.out.println("The array elements are:");
                    for (int i = 0; i < n; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    float totalSum = 0;
                    for (int i = 0; i < n; i++) {
                              totalSum += a[i];
                    }
                    float average = totalSum / n;
                    System.out.println("The average of the array is = " + average);
          }
}
