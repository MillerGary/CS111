//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// rolls two dice
//************************************

public class Lab4Roll
{
    //Creates two die and rolls them
    public static void main (String[] args)
    {
        Die die1, die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        die1.roll();
        die2.roll();
        System.out.println ("Die one: " + die1 + ", Die two: " + die2);

        die1.roll();
        die2.setFaceValue(4);
        System.out.println ("Die one: " + die1 + ", Die two" + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println ("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println ("Die one: " + die1 + ", Die Two: " + die2);
        System.out.println (" New sum: " + sum);
    }
}
