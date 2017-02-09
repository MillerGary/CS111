//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// Represents a die
//************************************

public class Lab4Die
{
    public static void main (String[] args)
    {
        private final int MAX = 6;
        private int faceValue;

        //Constructor sets initial value
        public void Die()
        {
            faceValue = 1;
        }

        //Method rolls die and returns value
        public int roll()
        {
            faceValue = (int)(Math.random() * MAX) + 1;

            return faceValue;
        }

        //set Facevalue
        public void setFaceValue (int value)
        {
            faceValue = value;
        }

        //access FaceValue
        public int getFaceValue()
        {
            return faceValue;
        }

        public String toString()
        {
            String result = Integer.toString(faceValue);

            return result;
        }
}
