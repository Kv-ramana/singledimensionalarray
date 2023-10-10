import java.util.Scanner;
public class array1to10 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter the array elements 1 to 10 : ");
    int arr[]= new int[10];
    for(int i=0;i<10;i++) {
      arr[i]=scanner.nextInt();
      
    }
    System.out.println("enter the array elements are : ");
      for(int i=0;i<10;i++) {
      System.out.println(arr[i]);
      }
  }
}