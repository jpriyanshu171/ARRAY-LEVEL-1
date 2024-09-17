import java.util.Scanner;

public class ques6 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int a[] = new int[10];
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++) {
                              a[i] = sc.nextInt();
                    }
                    System.out.println("Enter the target value:");
                    int target = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < a.length; i++) {
                              if (a[i] == target) {
                                        found = true;
                                        System.out.println("Target found at " + i + " index position");
                                        break;
                              }
                    }
                    if (!found) {
                              System.out.println("Element not found");
                    }
          }
}
