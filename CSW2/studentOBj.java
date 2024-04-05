class student1 {
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

    public student1(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks=marks;


    }

}
