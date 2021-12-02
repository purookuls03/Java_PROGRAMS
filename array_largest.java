import java.util.Scanner;
class array_largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= max)
                max = arr[i];
        }
        System.out.println("Largest element in array is " + max);
        s.close();

    }
}