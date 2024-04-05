import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {

        double x, y, z, z2, z3, z4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");
        y = sc.nextInt();
        x = sc.nextInt();

        System.out.println();
        System.out.println();
        System.out.println("x+y: " + (x+y));
        System.out.println("x-y: " + (x-y));
        System.out.println("x/y: " + (x/y));



    }
}
