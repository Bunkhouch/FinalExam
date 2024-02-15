import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input numbers:");

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
