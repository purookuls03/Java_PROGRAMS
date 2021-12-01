import java.util.Scanner;
public class TotalLength_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Long a = s.nextLong();
        int count=0;
        while(a!=0)
        {
            Long rem=a%10;
            count++;
            a=a/10;
        }
        System.out.println(count);
        s.close();
    }
}
