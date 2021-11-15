
import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square
{
    int n;
    public Square(int n)
    {
        this.n=n;
    }
    public void area()
    {
        int res=n*n;
        System.out.println(res);
    }
}
class Circle
{
    int n;
    public Circle(int n)
    {
        this.n=n;
    }
    public void area()
    {
        double res=3.14*n*n;
        System.out.println(res);
    }
}


public class Area_sololearn{
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}