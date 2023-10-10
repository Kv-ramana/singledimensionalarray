import java.util.*;

public class sumofoddnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        System.out.println("Enter 10 array elements");
        int Arr[] = new int[10];

        for (int i = 0; i < 10; i++)
            Arr[i] = sc.nextInt();

        for (int num : Arr) {
            if (num % 2 != 0) {
                sumOdd += num;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
