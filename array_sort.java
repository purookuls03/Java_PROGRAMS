import java.util.Scanner;

public class array_sort {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
        s.close();
    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("  "+arr[i]);
        }
    }

}
