
public class referenceVar {
    public static void main(String[] args) {
        student1 s1 = new student1("Anshuman", 21, 90);
        student1 s2 = new student1("Naina", 26, 90);
    s1 = s2;
        System.out.println(s1);

    }
}
