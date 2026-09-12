public class Reference {
    public static void main(String[] args) {

        Vehical obj1 = new Car();
        obj1.print();

    }
}

class Vehical {
    void print() {
        System.out.println("vehical");
    }
}

class Car extends Vehical {
    void print() {
        System.out.println("car");
    }
}
