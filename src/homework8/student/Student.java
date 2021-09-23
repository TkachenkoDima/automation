package homework8.student;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5.0) {
            return 100;
        }
        else {
            return 80;
        }
    }

    public String getFirstName() {
        return firstName;
    }
}