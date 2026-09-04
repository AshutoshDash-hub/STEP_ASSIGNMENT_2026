class Student {

    // Instance fields
    String name;
    int attendance;

    // Static field
    static String collegeName =
            "SRM Institute of Science and Technology";

    // Static counter
    static int studentCount = 0;

    // Constructor
    Student(String name, int attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println(
                "Students created: " + studentCount
        );
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 =
                new Student("Ravi", 90);

        Student student2 =
                new Student("Anitha", 95);

        Student.printCollegeInfo();
    }
}
