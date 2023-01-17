import java.util.*;
class string_palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack st = new Stack();
        in.close();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        String reverseString = "";

        while (!st.isEmpty()) {
            reverseString = reverseString+st.pop();
        }

        if (s.equals(reverseString))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}