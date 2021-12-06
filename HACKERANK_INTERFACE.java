import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here


class MyCalculator implements AdvancedArithmetic
{
    int x;
    public int divisor_sum(int a)
    {
        int x=1;
        int t=0,c=0;
        while(x<=a)
        {
            if(a%x==0)
            {
                t=x;
                c+=t;
            }
            x++;
        }
        return c;
    }

}



class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

