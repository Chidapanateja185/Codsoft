
public class Student {
    private String name;
    private int rollnumber;
    private String grade;
    private String email;
    private String phoneNumber;

    public Student() {
    }

    public Student(String name, int rollnumber, String grade, String email, String phoneNumber) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollnumber=" + rollnumber + ", grade=" + grade + ", email=" + email
                + ", phoneNumber=" + phoneNumber + "]";
    }

}
