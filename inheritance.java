public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.color = "blue";
        System.out.println(shark.color);
        shark.eat();

        dog huski = new dog();
        huski.legs = 4;
        System.out.println(huski.legs);
        huski.eat();
        huski.poisnous();

        deer d1 = new deer();
        d1.eat();
    }

    static class Animal {
        String color;

        void eat() {
            System.out.println("eating");
        }

        void breath() {
            System.out.println("breathing");
        }
    }

    static class mammel extends Animal {
        int legs;

        void poisnous() {
            System.out.println("not poisning");
        }
    }

    static class deer extends Animal {
        void eat() {
            System.out.println("eat grass");
        }
    }

    static class dog extends mammel {
        String species;

        void bark() {
            System.out.println("barking");
        }
    }

    static class Fish extends Animal {
        int fins;""

        void swim() {
            System.out.println("swiming");
        }
    }
}