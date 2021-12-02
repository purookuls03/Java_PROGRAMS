import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        int len = str.length();
        System.out.println("Length of a string : " + len);
        s.close();
    }
}
