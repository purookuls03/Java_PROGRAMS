import java.util.Scanner;
class array_length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int len = arr.length;
        System.out.println("Length of a array : "+len);
        s.close();

    }

}
