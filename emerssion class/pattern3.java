// public class pattern3 {
//     public static void main(String[] args) {
//         int n = 7;
//         int nst = n/2;
//         int nsp = 1;
//         int row=0;   
//         while(row<n){
//             //stars
//             for(int i=0;i<nst;i++)
//                 System.out.print("* ");
            
//             //space
//             for(int i=0;i<nsp;i++)
//                 System.out.print("  ");

//             //stars
//             for(int i=0;i<nst;i++)
//                 System.out.print("* ");
            
//             if(row<n/2){
//                 nst--;
//                 nsp+=2;
//             }
//             else{
//                 nsp-=2;
//                 nst++;
//             }

//             row++;
//             System.out.println();
//         }
//     }
// }


public class pattern3 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 4;
        int nsp = 0;
        int row=0;   
        while(row<n){
            //stars
            for(int i=0;i<nst;i++)
                System.out.print("* ");
            
            //space
            for(int i=0;i<nsp;i++)
                System.out.print("  ");

            //stars
            for(int i=0;i<nst;i++)
                System.out.print("* ");
            
            if(row<n/2){
                nst--;
                nsp+=2;
            }
            else{
                nsp-=2;
                nst++;
            }

            row++;
            System.out.println();
        }
    }
}
