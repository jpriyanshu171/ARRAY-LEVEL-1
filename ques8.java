import java.util.Arrays;
import java.util.Scanner;

public class ques8 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int a[] = new int[10];
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++) {
                              a[i] = sc.nextInt();
                    }
                    Arrays.sort(a);
                    System.out.println("Sorted array:");
                    for (int i = 0; i < 10; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Enter key value:");
                    int key = sc.nextInt();
                    int result = binarySearch(a, key, 0, a.length - 1);
                    if (result < 0) {
                              System.out.println("Key value not found");
                    } else {
                              System.out.println("Key value found at " + result + " index position");
                    }
          }

          public static int binarySearch(int a[], int key, int start, int end) {
                    while (start <= end) {
                              int mid = (start + end) / 2;
                              if (a[mid] < key) {
                                        start = mid + 1;
                              } else if (a[mid] == key) {
                                        return mid;
                              } else {
                                        end = mid - 1;
                              }
                    }
                    return -1;
          }
}
