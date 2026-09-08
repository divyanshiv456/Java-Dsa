public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "GSA";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);
        s2.returnPercentage(32, 45, 55);

        Student s3 = new Student();
        s3.returnPercentage(89, 98, 92);
        s3.SchoolName = "AVS";
        System.out.println(s2.SchoolName);

        horse mustang = new mustang();


    }

    static class Student {
        static int returnPercentage(int math, int phy, int chem){
            return (math + phy + chem) / 3;
        }
        String name;
        int age;

        static String SchoolName;

        void setName(String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
    }

    static class animal{
        animal(){
            String color;
            System.out.println("animal constructor called");
        }
    }

    static class horse extends animal{
        horse(){
            // super();
            System.out.println("horse constructor");
        }
    }
    static class mustang extends horse {
        mustang(){
            System.out.println("mustang constructor called");
        }
    }
}
