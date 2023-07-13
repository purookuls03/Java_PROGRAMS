// import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the value of N: ");
        int n = 7;//scanner.nextInt();
        n = (n+1)/2;
        // scanner.close();

        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int sp = 1; sp <= (n - row) * 2; sp++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Print increasing numbers
            for (int num = 2; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        for (int row = n - 1; row >= 1; row--) {
            // Print spaces
            for (int sp = 1; sp <= (n - row) * 2; sp++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Print increasing numbers
            for (int num = 2; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();

    }
}
}
