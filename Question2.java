import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner height1 = new Scanner(System.in);
    System.out.println("Enter height: ");  
    double height = height1.nextDouble();
    Scanner weight1 = new Scanner(System.in);
    System.out.println("Enter weight: ");  
    double weight= weight1.nextDouble();  
    
    double bmi = weight/(height*height);
    System.out.println("BMI :"+bmi);
  }
}
