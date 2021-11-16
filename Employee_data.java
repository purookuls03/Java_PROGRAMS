/*
    Write a program that would print the information (name, year of joining, address) of three employees by creating a class named 'Employee'. The output should be as follows:

        Name        Year of joining         Address
        Aman            2021                Chandigarh
        Sunil           2000                 Mathura
        Rohan           2010                 Agra
*/
class Employee_data {
    static String n;
    static int y;
    static String add;

    public static void setdata(String Name, int yoj, String address) {
        n = Name;
        y = yoj;
        add = address;
    }

    public static void display() {
        System.out.println("Name : " + n + "\nYear of joining : " + y + "\nAddress : " + add);
    }

    public static void main(String args[]) {
        Employee_data.setdata("Aman", 2021, "Chandigarh");
        Employee_data.display();
        Employee_data.setdata("Sunil", 2000, "Mathura");
        Employee_data.display();
        Employee_data.setdata("Rohan", 2010, "Agra");
        Employee_data.display();
    }

}
