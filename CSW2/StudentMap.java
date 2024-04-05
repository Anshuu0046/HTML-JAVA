import java.util.*;
import java.util.HashMap;
public class StudentMap {
    public static void main(String[] args) {
        HashMap< Integer , stud> s = new HashMap();
        s.put(1, new stud("Dhriti", 67, 6.5));
        s.put(2, new stud("Anshuman", 66, 8.0));
        s.put(3, new stud("Adi", 65, 8.9));
        s.put(4, new stud("Shayan", 68, 7.8));
        s.put(5, new stud("naina", 69, 9.1));


        Set<Map.Entry<Integer, stud>> st = s.entrySet();
        for (Map.Entry<Integer, stud> entry : st)
        {
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
            System.out.println();
        }
        System.out.println(s);
    }
}

class stud {
    String name;
    int roll;
    double marks;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [name + " + name + " | roll: " + roll + " | Marks: " + marks;
     }

    public stud(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks=marks;


    }

}


