import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1 = A.length();
        int len2 = B.length();
        int sum = len1 + len2;
        System.out.println(sum);
        System.out.println(A.compareTo(B)>0?"Yes":"No");

        String str1 = A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        String str2 = B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        System.out.println(str1+" "+str2);
    }
}



