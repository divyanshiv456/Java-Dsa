public class constructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Divyanshi";
        s1.age = 20;
        s1.password = "abc";
        s1.marks[0] = 20;
        s1.marks[1] = 18;
        s1.marks[2] = 12;

        // s1.password = "div";

        student s2 = new student(s1);
        s1.marks[2] = 19;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        System.out.println(s2.password);

        // for (int i = 0; i < 3; i++) {
        // System.out.println(s1.marks[i]);
        // }

    }
}

class student {
    String name;
    int age;
    String password;
    int marks[];

    student() {
        marks = new int[3];
    }

    // student(student s1) {
    // this.name = s1.name;
    // this.age = s1.age;
    // this.password = s1.password;
    // marks = new int[3];
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    student(student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}