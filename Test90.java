class Mythread90 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("myhtread90");
        }
    }
}

public class Test90 {
    public static void main(String[] args) {
        Mythread90 obj1 = new Mythread90();
        Thread obj = new Thread(obj1);
        obj.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}