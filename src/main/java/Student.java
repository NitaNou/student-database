import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int studentYear;
    private String fiveDigitID;
    private String courses;
    private static int courseCost = 600;
    private int studentBalance;
    private static int idIncrementer = 1000; // using static field to initialize ID counter for class whenever a student is added

    // Constructor: ask user to enter student's name & grade level
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();
        System.out.println("Enter student's grade level: \n1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.studentYear = in.nextInt();
        setID();
        System.out.println(firstName + " " + lastName + " " + fiveDigitID);
    }

    // Generate ID
    private void setID() {
        this.fiveDigitID = studentYear + "" + idIncrementer;
        idIncrementer++;
    }

    // Enroll in courses
    public void enrollCourse(){
        System.out.println("The following courses are available:\n1) History 101\n2) Mathematics 101\n" +
                            "3) English 101\n4) Chemistry 101");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter course to enroll in: ");
        int course = in.nextInt();
        System.out.println("ENROLLED COURSE(S): " + course);


    }

    // View balance

    // Pay tuition

    // Show status

}
