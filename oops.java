public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Divyanshiverma";
        myAcc.setPassword("div456");

        child c1 = new child();
        child c2 = new child("divyanshi");
        child c3 = new child(20);
    }
}

class BankAccount {
    public String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calpercentage(int phy, int chem, int math) {
        percentage = ((phy + chem + math) / 3) * 100;
        System.out.println(percentage);
    }
}

class child {
    String name;
    int age;

    child() {
        // this.name = name;
        System.out.println("constructor is called");
    }

    child(String name) {
        this.name = name;
    }

    child(int age) {
        this.age = age;
    }
}