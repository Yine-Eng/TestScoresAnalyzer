/**
   The TestScores class stores data about test scores
   for the TestScores Class Custom Exception 
	programming challenge.
*/

public class TestScores
{
   // Variable to reference an array holding test scores
   private double[] scores;
   
   /**
      The constructor initializes an object with
      an array of scores. If the array contains
      an invalid value (less than 0 or greater than
      100) an exception is thrown.
      @param s The array of test scores.
      @exception InvalidTestScore When the argument
                 array contains an invalid value.
   */
      
   public TestScores(double[] s) throws InvalidTestScore
   {
     scores = s;
     for (int i = 0; i < scores.length; i++)
       {
         if (scores[i] < 0 || scores[i] > 100)
         {
           throw new InvalidTestScore("An invalid test score was found at index " + i + ". A good score must be between 0 and 100.");
         }
       }

   }
   
   /**
      The getAverage method returns the average
      of the object's test scores.
      @return The average of the object's test scores.
   */
   
   public double getAverage()
   {
      double total = 0.0;  // Accumulator
      
      // Accumulate the sum of the scores.
      for (int i = 0; i < scores.length; i++)
         total += scores[i];
      
      // return the average.
      return (total / scores.length);
   }
}