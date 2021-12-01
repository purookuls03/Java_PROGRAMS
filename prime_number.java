import java.util.Scanner;

class prime_number {
    public static void main(String[] args){
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = s.nextInt();
        int i = 2;
        while(i<a){
            if (a % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        if(flag)
            System.out.println("Given number is Prime");
        else
            System.out.println("Given number is Not Prime");
        s.close();
    }



}
