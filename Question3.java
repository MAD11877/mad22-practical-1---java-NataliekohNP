import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner inputint = new Scanner(System.in);
    System.out.println("Enter Integer");
    int input = inputint.nextInt();
    int result = input*input;
    System.out.println("Result: " + result);
  }
}
