// Define class GradeBook with a member method displayMessage

public class GradeBookLoop 
{
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
        System.out.println("The class average is "+average;
        }
    }

}
