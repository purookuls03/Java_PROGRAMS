import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(sc.hasNext())
        {
            String name1 = sc.nextLine();
            System.out.println(count+" "+name1);
            count++;
        }
    }
}
