import java.util.Scanner;
import java.util.Arrays;

public class NumberSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        // Input 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Sorting the array using Arrays.sort()
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("\nNumbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
