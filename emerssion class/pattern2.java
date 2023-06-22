// public class pattern2{
//     public static void main(String[] args){
//         int n=5;
//         int nst=2*n-1;
//         int nsp=n-1;
//         int row=0;
//         while(row<n){
//             for(int i=0;i<nsp;i++)
//                 System.out.print(" ");
            
//             for(int i=0;i<nst;i++)
//                 System.out.print("* ");

//             nst-=2;
//             nsp+=2;
//             row++;
//             System.out.println();
//         }
//     }
// }

public class pattern2{
    public static void main(String[] args){
        int n=5;
        int nst=1;
        int nsp=n-1;
        int row=0;
        int trow=(2*n)-1;
        while(row<trow){
            for(int i=0;i<nsp;i++)
                System.out.print("  ");
            
            for(int i=0;i<nst;i++)
                System.out.print("* ");

            if(row<trow/2){
                nst++;
                nsp--;
            }
            else{
                nst--;
                nsp++;
            }
            System.out.println();
            row++;

            
        }
    }
}