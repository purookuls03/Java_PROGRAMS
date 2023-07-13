import java.util.*;
public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==(n-1))
                    sum=sum+arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
        sum=0;
        System.out.println();

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if(i==(n-1))
                    sum=sum+arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
        sum=0;
        System.out.println();

        for(int i=2;i<n;i++){
            for(int j=2;j<=i;j++){
                if(i==(n-1))
                    sum=sum+arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
        sum=0;
        System.out.println();

        for(int i=3;i<n;i++){
            for(int j=3;j<=i;j++){
               if(i==(n-1))
                    sum=sum+arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
        // sum=0;
        sc.close();
    }
}   
