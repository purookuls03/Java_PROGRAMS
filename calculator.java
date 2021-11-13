/*
*Create a new class called Calculator with the following methods: 
*1. A static method called powerInt(int num1,int num2)
    This method should return num1 to the power num2.

*2. A static method called powerDouble(double num1,int num2).
    This method should return num1 to the power num2.

*3. Invoke both the methods and test the functionalities.

*Hint: Use Math.pow(double,double) to calculate the power.
*/
import java.lang.Math;
import java.util.Scanner;
public class calculator {
    public static int powerint(int num1,int num2)
    {
        int res=(int)Math.pow(num1,num2);
        return res;
    }
    public static double powerdouble(double num1,int num2)
    {
        return Math.pow(num1,num2);
    }

    public static void main(String[] args)
    {
        System.out.println(powerint(10,20));
        System.out.println(powerdouble(1.50,2));  
    }
}
