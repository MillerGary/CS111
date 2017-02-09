// GradeBookTest class with argument

import java.util.Scanner;

public class GradeBookTest3 {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        GradeBook3 myGradeBook = new GradeBook3();
        
        System.out.printf("Initial course name is : %s\n\n", myGradeBook.getCourseName() );

        System.out.println("Please enter the course name:");
        String courseName = input.nextLine();
        myGradeBook.setCourseName (courseName);
        System.out.println();

        myGradeBook.displayMessage();
    }
}
