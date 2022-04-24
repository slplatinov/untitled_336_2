package lab_6;

public class Student {
    String firstName, lastName, group;
    double avgMark;

    public Student(String firstName, String lastName, String group,
                   double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public Student() {
    }


    public double getScholarship() {
        return avgMark == 5 ? 100 : 80;
    }
}
