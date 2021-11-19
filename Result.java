/*
    Anonymous class
        1. Abstract modifier
        2. Interface

    if you don't knw the definition  / behaviour then we will create abstract method

*/

abstract class First
{
    abstract public void method1();
}


// class Second extends First
// {

//     @Override
//     public void method1() {
//        System.out.println("Welcome"); 
        
//     }
    
// }


interface i1
{
    void m1();
    public void m2();
    abstract void m3();
   
    // public abstract
    public int b = 80;  // public static final is automatically deifned by initiliazing variable
}


public class Result 
{
    
 
    public static void main(String[] args)
    {
        /* abstract */
       /* First obj1 = new First() {
            @Override
            public void method1() {
                System.out.println("Welcome");
            }
        };
        obj1.method1(); */

        /* interface */
        i1 obj = new i1() {
            @Override
            public void m1() {
                System.out.println("Welcome interface m1");
            }

            @Override
            public void m2() {
                System.out.println("Welcome interface m2");
            }

            @Override
            public void m3() {
                System.out.println("Welcome interface m3");
            }
        };
        obj.m1();
        obj.m2();
        obj.m3();
    }    
}