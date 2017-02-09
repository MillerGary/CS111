import java.util.Scanner;
public class Student
{
//declare instance data
// ---------------------------------------------
    String name;
    int midterm;
    int finaltest;
    double finalgrade = (midterm + finaltest) / 2;

public void inputGrades()
{
//add body of inputGrades
    Scanner grades = new Scanner (System.in);
    System.out.println("Please enter student's name: " +name);
    name = scan.nextString();
    System.out.println("Please enter the score for midterm: " +midterm);
    midterm = scan.nextInt;
    System.out.println("P;ease enter the score for finaltest: " +finaltest);
    finaltest = scan.nextInt;
    System.out.println("The semester grade for +name is: " +finalgrade);



}

