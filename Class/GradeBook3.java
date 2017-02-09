// Define class GradeBook with a member method displayMessage

public class GradeBook3 
{
    //Instance Variables
    private String courseName;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;
    // method to display a welcome message
    public void displayMessage() 
    {
        {    
            System.out.println("Welcome to the Grade Book!"+getCourseName());
        }

    //method to calculate the grade average
    //updated while loop to allow the user to enter
    //the grades as many times as needed
    //and still have a termination condition degined by the user
    public void determineGradeaverage ()
    {
        Scanner input = new Scanner (System.in);
        double total = 0;
        int counter = o;
        int average;
        double grade;

        System.out.println("Enter a grade or enter -1 to quit");
        grade = input.nextDouble();

        while(grade!=-1)
        {
            total += grade;
            counter++;
            grade = input.nextDouble();
        }

        if(counter==0)
        {
            System.out.println("No grades were entered");
        }
        else
        {
        average = total/counter;
        System.out.println("The class average is "+average);
        }
    }

    //keep track and display the number of As, bs, Cs, Ds, Fs
    public void gradeCounter (double grade)
    {
        if(grade >= 90 && grade <= 100)
        {
            aCount++;
        }
        else if(grade >=80 && <= 90)
        {
            bCount++;
        }
        else if(grade >=70 && grade <= 70)
        {
            dCount++;
        }
        else
        {
            fCount++;
        }
    }

}
