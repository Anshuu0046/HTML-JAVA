import java.util.Scanner;


class EvenNumberException extends Exception {
    EvenNumberException(String message) {
        super(message);
    }
}

public class except2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {

            if (num % 2 == 0) {

                throw new EvenNumberException("Number is even: " + num);
            } else {
                System.out.println(num + " is odd.");
            }
        } catch (EvenNumberException e) {

            System.out.println("Caught my exception: " + e.getMessage());
        }
    }
}
