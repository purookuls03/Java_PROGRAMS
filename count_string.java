import java.util.Scanner;

public class count_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words : " + count);
        s.close();
    }
}
