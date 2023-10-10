import java.util.Scanner;

public class evennumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 array elements : ");
    int arr[] = new int[10];

    // Read array elements
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Even numbers:");

    // Print even numbers
    for (int i = 0; i < 10; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
      }
    }
  }
}
