import java.util.Scanner;

public class ques4 {
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
                    System.out.println("Reversed array = ");
                    for (int i = n - 1; i >= 0; i--) {
                              System.out.print(a[i] + " ");
                    }
          }
}
