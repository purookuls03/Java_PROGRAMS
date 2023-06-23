class Test1 implements Runnable
{
    public void run() {
        for(int i=0; i<=5;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1500);
            }
            catch(Exception e) {
                System.out.println("Exception found");
            }
        }
    }
}
class Test2 implements Runnable
{
    public void run() {
        for(int i=0; i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1500);
            }
            catch(Exception e) {
                System.out.println("Exception found");
            }
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        Test1 obj1 = new Test1();
        Test2 obj2= new Test2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}