import java.util.*;

public class StudentManagement {

    public List<Student> students;

    private Scanner sc;
    private int rollnumber;

    public StudentManagement() {
        this.students = new ArrayList<>();
        this.sc = new Scanner(System.in);

    }

    public void addStudent() {

        System.out.print("Enter student name: ");
        String name = sc.next();
        // sc.nextLine(); // Consume newline left-over
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        Student student = new Student(name, rollNumber, grade, email, phoneNumber);
        students.add(student);
        System.out.println("---------------Student details added Successfully----------------------------");
    }

    public void removeStudent() {
        System.out.println("Enter the student rollnumber you want to delete");
        rollnumber = sc.nextInt();

        for (Student student : students) {
            if (student.getRollnumber() == rollnumber) {
                students.remove(student);
                System.out.println("------------------------Student removed successfully!---------------------------");
                return;
            }
        }
        System.out.println("---------------------------Student not found!-------------------------");

    }

    public void search() {
        System.out.println("Enter the Student rollenumber you want to see");
        rollnumber = sc.nextInt();

        for (Student student : students) {
            if (student.getRollnumber() == rollnumber) {
                System.out.println("------" + student + "---------");
                return;
            }
        }
        System.out.println("-------------------------Student not found !---------------------------");
    }

    public void display() {
        if (students.isEmpty()) {
            System.out.println("----------------------------No Students present------------------------------");
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void run() {
        while (true) {
            System.out.println("Student Management System");
            System.out.println("1) Add Student");
            System.out.println("2)Remove Student");
            System.out.println("3)Search Student");
            System.out.println("4)Display all students");
            System.out.println("5)Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    display();
                    break;
                case 5: {
                    System.out.println("Exit from the operation");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.run();
    }
}
