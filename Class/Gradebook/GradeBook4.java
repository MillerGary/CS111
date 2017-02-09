// Define class GradeBook with a member method displayMessage

public class GradeBook4 {
    private String courseName; //instance variable

    public GradeBook4 (String name) 
    {
        courseName = name;
    }

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
