import java.util.Scanner;

public class ques11 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter array size:");
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    int count = 0;
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                              a[i] = sc.nextInt();
                              if (a[i] > 0) {
                                        count++;
                              }
                    }
                    System.out.println("Total positive count = " + count);
          }
}
