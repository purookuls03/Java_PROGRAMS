public class shape
{
   
    void draw()
    {
        System.out.println("Draw Shape");
    }
    void erase()
    {
        System.out.println("Erasig Shape");
    }

    public static void main(String args[])
    {
        shape obj = new shape();
        obj.draw();
        obj.erase();
    }
}