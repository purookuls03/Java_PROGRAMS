import java.util.Scanner;
public class Count_singleDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        count c = new count();
        c.data(a);
    }

}

class count{
    public void data(int n){
        int[] arr = new int[20];
        while(n!=0){
            int rem=n%10;
            arr[rem]++;
            n=n/10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(i+ ": "+arr[i]+"times");
            }
        }
    }

}
