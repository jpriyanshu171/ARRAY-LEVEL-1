import java.util.Scanner;

public class ques7 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int a[] = new int[5];
                    System.out.println("Enter 5 numbers:");
                    for (int i = 0; i < 5; i++) {
                              a[i] = sc.nextInt();
                    }
                    System.out.println("Enter target value:");
                    int target = sc.nextInt();
                    int freq = 0;
                    for (int a1 : a) {
                              if (a1 == target) {
                                        freq++;
                              }
                    }
                    if (freq > 0) {
                              System.out.println("Number found with frequency = " + freq);
                    } else {
                              System.out.println("Number not found");
                    }
          }
}
