public class Abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
    }

    abstract static class animal {
        String color;

        animal(String color) {
            color = "brown";
        }

        animal(){
            System.out.println("animal constructor called..");
        }

        void eat() {
            System.out.println("eating");
        }

        abstract void walk();
    }

    static class horse extends animal {
        horse(){
            System.out.println("horse constructor called..");
        }
        void changeColor() {
            color = "dark brown";
        }
        void walk() {
            System.out.println("walk on 4 legs");
        }
    }

    static class chicken extends animal {
        void changeColor(){
            color = "white";
        }
        void walk() {
            System.out.println("walk o 2 legs");
        }
    }
}
