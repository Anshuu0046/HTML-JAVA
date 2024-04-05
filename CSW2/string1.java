import java.util.Arrays;

public class string1 {
    public static void main(String[] args) {
        String s1 = "andgjdghgjkhdugufyf";
        String s4 = "anshuman";
        String s5 = "anshuman";
        int a = 2542575;
        String s6 = "      Mera naam anshuman     ";
        String s7 = "1 2 3 4 5 6 7 8 9 10";
        String s8 = "anshuman kumar Tripathy";
        String [] ar = s8.split(" ");

        // methods
        String si = s1.substring(3);
        String st = s1.substring(4, 8);
        String s2 = s1.toUpperCase();
        String s3 = String.valueOf(a);

        System.out.println("------------------------------");
        if (s4 == s5) {
            System.out.println("both are equal" + " : " + s5 +  " is equal to: " + s4);
        } else {
            System.out.println("not equal");
        }
        System.out.println("------------------------------");




        // print the elements
        System.out.println("1. " + si + " : Substring🤧");
        System.out.println("2. " + st  + " : Substring-2");
        System.out.println("3. " + s2  + " : Uppercase");
        System.out.println("4. " + s3  + " : ValueOf");
        System.out.println("5. " + s4.equals(s5)  + " : Equals Method");
        System.out.println("6. " + s5.replace( 'n', 'a')  + " : Replace method");
        System.out.println("7. " + s6.trim()  + " : Trim method");
        System.out.println("8. " + Arrays.toString(s7.split(" ")) + " : Split method👽");
        System.out.println("9. " + (ar.length > 2) + " : Finding the middle name");
        System.out.println("10. " + Arrays.toString(ar));

    }
}
