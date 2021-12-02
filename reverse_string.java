import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of string: ");
        str = s.nextLine();
        char[] arr = str.toCharArray();
        int y = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[y];
            arr[y] = temp;
            y--;
        }
        str = new String(arr);
        System.out.println("Reverse string : " + str);
        s.close();
    }
}
