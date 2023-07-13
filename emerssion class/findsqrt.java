import java.util.*;
class findsqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = (int)Math.sqrt(n);
        System.out.println(res);
        sc.close();
    }
}