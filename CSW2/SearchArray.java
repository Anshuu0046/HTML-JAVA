import java.util.*;
import java.util.Objects;


public class SearchArray {
    public static void main(String[] args) {
        Student[] studentsArray = {
                new Student("Anshuman", 101),
                new Student("Naina", 102),
                new Student("Dhriti", 103),
                new Student("Adi", 104),
                new Student("Shayan", 105)
        };

        Arrays.sort(studentsArray, new StudentRollComparator());

        System.out.println(Arrays.toString(studentsArray));

        Arrays.sort(studentsArray, new StudentHelper());

        System.out.println(Arrays.toString(studentsArray));


    }
}

class StudentHelper implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase());
    }

}

class StudentRollComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRoll(), s2.getRoll());
    }
}




class Student {
    public String name;
    public int roll;

    public Student(String name, int roll) {
        super();
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(name, other.name) && roll == other.roll;
    }


}

