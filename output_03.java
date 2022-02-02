class Demo_01 {

    static
    {
        System.out.println("inside static block");
    }
    int num1;
    Demo_01()
    {
        System.out.println("Inside constructor");
        num1 = 500;
    }
}

public class output_03 {

    public static void main(String[] args)
    {
        Demo_01 obj1 = new Demo_01();
        System.out.println(obj1.num1);
    }
}

