import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int flag=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[flag]){
                    flag = j;
                }
                
            }
            int t = arr[i];
                arr[i]=arr[flag];
                arr[flag]=t;
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        sc.close();
    }
}
