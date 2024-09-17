import java.util.Arrays;
import java.util.Scanner;

public class ques5 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter first array size:");
                    int n1 = sc.nextInt();
                    int a1[] = new int[n1];
                    System.out.println("Enter second array size:");
                    int n2 = sc.nextInt();
                    int a2[] = new int[n2];
                    System.out.println("Enter first array elements:");
                    for (int i = 0; i < n1; i++) {
                              a1[i] = sc.nextInt();
                    }
                    System.out.println("Enter second array elements:");
                    for (int i = 0; i < n2; i++) {
                              a2[i] = sc.nextInt();
                    }
                    System.out.println("The first array elements are:");
                    for (int i = 0; i < n1; i++) {
                              System.out.print(a1[i] + " ");
                    }
                    System.out.println();
                    System.out.println("The second array elements are:");
                    for (int i = 0; i < n2; i++) {
                              System.out.print(a2[i] + " ");
                    }
                    System.out.println();
                    int a[] = new int[n1 + n2];
                    for (int i = 0; i < n1; i++) {
                              a[i] = a1[i];
                    }
                    for (int i = 0; i < n2; i++) {
                              a[n1 + i] = a2[i];
                    }
                    Arrays.sort(a);
                    System.out.println("Merged array = ");
                    for (int i = 0; i < a.length; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
          }
}
