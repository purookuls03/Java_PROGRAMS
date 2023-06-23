class GenericMethod  <T>
{
    public void display(T val)
    {
        System.out.println(val);
    }
    public static void main(String[] main){
        GenericMethod obj = new GenericMethod();
        obj.display("ABC");
        obj.display(5562);
        obj.display('a');
        obj.display(32.77);
    }
}

