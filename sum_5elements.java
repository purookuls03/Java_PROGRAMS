import java.util.Scanner;

public class sum_5elements {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("The sum of all elements in array is " + sum);
        s.close();
    }
}