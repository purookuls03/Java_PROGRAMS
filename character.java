import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         char ch = (char)('A'+j-1);
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         char ch = (char)('A'+i-1);
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                char ch = (char)(64+j-1+i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

