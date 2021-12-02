//write a Java program to find if the given number is palindrome or not

import java.util.Scanner;

class palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = s.nextInt();
        int rev=0;
        int temp = n;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
            System.out.println("Not a Palindrome Number");
    }
}
