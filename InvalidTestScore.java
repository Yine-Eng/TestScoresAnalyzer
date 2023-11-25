/**
   InvalidTestScore exceptions are thrown by
   TestScore objects when an invalid test score is
   passed into the constructor for the TestScores 
	Class Custom Exception programming challenge.
*/

public class InvalidTestScore extends Exception
{
  public InvalidTestScore(String message)
  {
    super(message);
  }

}
