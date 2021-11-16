/*
    Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
    respectively by creating a class named 'Rectangle' with two instance variables, length 
    and breadth and a  method named 'Area' which returns the area. Initialise the object attributes 
    by taking the input from the user in the constructor.
*/
class Rectangle {
    int len;
    int breadth;

    Rectangle(int l, int b) {
        len = l;
        breadth = b;
    }

    public int area() {
        return len * breadth;
    }
}

public class Area_tworectangles {
    public static void main(String args[]) {
        Rectangle obj1 = new Rectangle(4, 5);
        Rectangle obj2 = new Rectangle(5, 8);
        System.out.println(obj1.area());
        System.out.println(obj2.area());
    }

}
