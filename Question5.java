import java.util.Scanner;
import java.util.Arrays;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer");
    int number = in.nextInt();
    int c;
    int [] storeval= new int[number];
    int [] comparenum= new int[number];
    for  (int i=0; i<number;i++){
      storeval[i] = in.nextInt();
    }
    for (int i=0; i<number;i++)
      {
        c=1;
        for(int j=i+1;j<number;j++){
          if(storeval[i]==storeval[j])
          {
            c++;
            storeval[j]=-1;
          }
          comparenum[i]=c;
        }
      }
    int m = comparenum[0];
    for(int i=0; i<number;i++){
      if comparenum[i] >= m){
        m = comparenum[i];
      }
    }
    for(int i=0; i<number;i++){
      if(comparenum[i] == m){
        System.out.print(storeval[i]);
      }
    }
    
  }
}
