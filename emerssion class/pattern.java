class pattern{
    public static void main(String args[]){
        int row=5;
        for(int i=1;i<=row;i++){   
            for(int j=row;j>=1;j--){   
                if(i>=j)
                    System.out.print("*");    
                else
                    System.out.print(" ");
            }

            System.out.println();   
        }
    }
}