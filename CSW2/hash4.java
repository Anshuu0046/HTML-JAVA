import java.util.*;

public class hash4 {
    public static void main(String[] args) {
        LinkedHashSet<zed> a = new LinkedHashSet<>();
        a.add(new zed("anshuman", 67));
        a.add(new zed("dhriti", 66));
        a.add(new zed("adi", 65));
        a.add(new zed("shayan", 68));


        System.out.println(a);
     }
}

class zed {
    String name;
    int roll;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        zed z = (zed) obj;
        return roll == z.roll;
    }

    public int getRoll() {
        return roll;
    }

    public zed(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name +  " #" + roll ;
    }
}

