class Student12 {
    int rollno;
    String name;
    // constructor overloading

    Student12() {
        rollno = 89;
        name = "abc";
    }

    Student12(int v1, String v2) {
        rollno = v1;
        name = v2;
    }

    public void show() {
        System.out.println(rollno + "\t" + name);
    }

}

class Student {
    public static void main(String[] args) {

        Student12 obj1 = new Student12();
        Student12 obj2 = new Student12(134, "aaa");

        obj1.show();
        obj2.show();

    }
}
