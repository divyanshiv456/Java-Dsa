public class ternary {
    public static void main(String[] args) {
        int number = 10;

        String type = (number % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // pass or fail

        int marks = 75;

        String result = (marks >= 33) ? "pass" : "fail";
        System.out.println("Result : " + result);
    }
}
