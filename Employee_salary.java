/*
    Write a program by creating an 'Employee' class having the following methods and print the final salary.

    1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
    2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
    3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.

*/
public class Employee_salary {
    static int sal;
    static int nhr;

    public static void getinfo(int salary, int no_hrs) {
        sal = salary;
        nhr = no_hrs;
        System.out.println("Current Salary : " + sal);
        System.out.println("No of hours work per day : " + nhr);
    }

    public static void Addsal() {
        if (sal < 500) {
            sal += 10;
        }

        System.out.println("If salary is less than 500 then salary increase +10 : " + sal);
    }

    public static void AddWork() {
        if (nhr > 6)
            sal += 5;

        System.out.println("If no of hours work per day is greater than 6 then salary increase as +5 : " + sal);
    }

    public static void main(String args[]) {
        Employee_salary.getinfo(1000, 8);
        Addsal();
        AddWork();

        Employee_salary.getinfo(350, 3);
        Addsal();
        AddWork();

        Employee_salary.getinfo(200, 8);
        Addsal();
        AddWork();
    }
}
