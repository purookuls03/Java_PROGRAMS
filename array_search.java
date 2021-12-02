import java.util.Scanner;

public class array_search {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = {16,42,13,64,53,26,17,48,39};
        int key = s.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=true;
                System.out.println("Found at index : "+i);
            }
        }
        if(flag==false)
            System.out.println("Key not found");
    }
}
