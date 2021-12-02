class Demo {

    static
    {
        System.out.println("inside static block");
    }
    public static int num1 = 56;
}

public class output_02 {

    public static void main(String[] args)
    {
        System.out.println("Inside main");
        System.out.println(Demo.num1);
    }
}
