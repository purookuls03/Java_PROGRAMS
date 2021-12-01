import java.util.Scanner;
class palindrome {
    static int temp=0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        temp=n;
        palindrome_02 p = new palindrome_02();
        p.pal(n);
        p.check(temp);
        s.close();
    }

}

 class palindrome_02{
    static int rev=0;
    public static void pal(int n) {
        while(n!=0){
             int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         }
     }
     public void check(int t){
        if(t==rev)
            System.out.print("It is a Palindrome number");
        else
            System.out.println("Not a Palindrome number");
     }

 }



