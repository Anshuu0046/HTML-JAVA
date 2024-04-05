import java.util.Scanner;
public class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = 0;
        try {
            n = Integer.parseInt(a) + Integer.parseInt(b);

        } catch(NumberFormatException e) {
            System.out.println(e);

        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println(n);
    }
}
