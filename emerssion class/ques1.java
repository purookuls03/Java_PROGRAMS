import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int res=1;
            for(int j=n-1;j>0;j--){
                if(i==j)
                    continue;
                res = res*arr[j];
                // System.out.print(res+" ");
            }
                System.out.print(res+" ");
                // System.out.println("");
        }
        sc.close();
    }
}
