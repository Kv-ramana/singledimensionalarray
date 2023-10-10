import java.util.Scanner;

public class reversearray {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 10 array elements: ");
    int arr[] = new int[10];
    
    
    for (int i = 0; i < 10; i++) {
      arr[i] = scanner.nextInt();
    }
    
    System.out.println("Array elements in reverse order:");
    
    
    for (int i = 9; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}

