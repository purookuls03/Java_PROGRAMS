// when we create the object of one class inside another class as an attribute then  it is known as containership

class Containership {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.p1.name= "HP";
        obj.p1.price = 36000;
        obj.p1.ram= 4;
        obj.display();
    }
}
class Processor
{
    int price;
    String name;
    int ram;
}
class laptop
{
    int weight;
    String pc_name;
    Processor p1;
    laptop()
    {
        weight = 50;
        pc_name = "Puroo";
        p1 = new Processor();
    }
    public void display()
    {
        System.out.println(weight);
        System.out.println(pc_name);
        System.out.println(p1.price);
        System.out.println(p1.name);
        System.out.println(p1.ram);
    }


}