import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class student{
    private int regdNo;

    public int getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(int regdNo) {
        this.regdNo = regdNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public student(int regdNo, String name) {
        this.regdNo = regdNo;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        student s1 = new student(20046, "Anshuman");
        System.out.println("Name : " + s1.getName() + "\nRegd no: " + s1.getRegdNo());
    }
}
