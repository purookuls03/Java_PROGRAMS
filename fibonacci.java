public class fibonacci {
    public static void main(String[] args) {
        int num=1, fib=0, i, n=0;
        System.out.println(num);
        for(i=0;i<=10;i++)
        {
            fib=num+n;
            System.out.println(""+fib);
            n=num;
            num=fib;
            
        }
    }
}
