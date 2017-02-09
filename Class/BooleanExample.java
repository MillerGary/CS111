/* Boolean Example class to calculate
/* the average of the quiz grades
 */
import java.util.Scanner;

public class BooleanExample
{
    //instace variables
    private String coursename;

    //constructor
    public BooleanExample (String name)
    {
        course = name;
    }

    //Methods
    public void setCourseName (String name)
    {
        courseName = name;
    }

    public String getcourseName();
    {
        return courseName;
    }

    public displayMessage()
    {
        System.out.println("Welcome to the Gradebook for :"+getCouseName());
    }

    //method to calculate the grade average
    public void dertermineGadeAverage ()
    {
        Scanner i = new Scanner (System.in);
        int total = 0;
        int counter = 1;
        int average;
        int grade;

        while(counter <= 5)
        {
            System.out.println("Enter a grade: ");
            grade = input.nextInt();
            total += grade;
            counter++;
        }

        average = total/counter;
        System.out.println("The class average is "+average);
    }
}
