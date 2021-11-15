public import java.util.Scanner;

public class Converter
{    
    public static void toBinary(int n)
    {    
        int binary[] = new int[40];    
        int index = 0;    
        while(n!=0)
        {    
            binary[index++] = n%2;    
            n = n/2;    
        }
        
        for(int i = index-1;i >= 0;i--)
        {    
            System.out.print(binary[i]);    
        }    
    }
}    

public class Deci_tobinary
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Converter.toBinary(x);
    }
}class deci_tobinary {
    
}
