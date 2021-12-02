import java.util.Scanner;

public class string_equals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str1 = s.nextLine();
        System.out.println("Enter another string : ");
        String str2 = s.nextLine();
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Equal String");
        }
        else
            System.out.println("Unequal string");

        s.close();
    }
}
