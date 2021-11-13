/*
Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/
class Member
{
    String name;
    int age;
    int number;
    String address;
    int salary;
   
    public void printSalary()
    {
        System.out.println(salary);
    }
   
}
   
class Employee extends Member
{
    String specialization;
}
   
class Manager extends Member
{
    String department;
    
}
   
class members{
    public static void main(String arg[])
    {
        Employee e = new Employee();
        e.name = "xyz";
        e.age = 23;
        e.number = 96899;
        e.address = "xyzxyz";
        e.salary = 1231;
        e.specialization = "xyz";
        System.out.println(e.specialization);

   
        Manager m = new Manager();
        m.name = "puroo";
        m.age = 23;
        m.number = 98645;
        m.address = "anandvihar";
        m.salary = 1231;
        m.department="abc";
        System.out.println(m.department);
    }
} 
   