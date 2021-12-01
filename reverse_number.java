import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int rev=0;
        while(a!=0){
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.print(rev);
        s.close();
    }

}
