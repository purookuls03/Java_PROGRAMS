import java.util.Scanner;

public class string_upperLower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        System.out.println("String in a upper case : "+str.toUpperCase());
        System.out.println("String in a upper case : "+str.toLowerCase());
        s.close();
    }
}
