import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // q1
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;

        System.out.println(avg);

        // q2
        int side = sc.nextInt();
        int area = side * side;

        System.out.println(area);

        ///q3
        System.out.println("enter the price of pen: ");
        float pen = sc.nextFloat();

        System.out.println("enter the price of pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("enter the price of eraser: ");
        float eraser = sc.nextFloat();

        float Total = pen + pencil + eraser;
        System.out.println("Total Cost of items: " + Total);

        // q5
        int $ = 24;
        System.out.println($);

    }
}
