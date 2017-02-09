// Define class GradeBook with a member method displayMessage

public class GradeBook3 {
    private String courseName = "Music101"; //instance variable

    public void setCourseName (String name) {
        courseName = name;
    }

    public String getCourseName () {
        return courseName;
    }

    // method to display a welcome message
    public void displayMessage() {
        System.out.printf("Welcome to the Grade Book for %s\n ",getCourseName());
    }
}
