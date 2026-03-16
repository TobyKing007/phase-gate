import java.util.Scanner;

public class TaskTen      {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);

    int sum = 0;

    for (int count = 0; count < 3; count ++)        {   
    System.out.println  ("enter number");
    int number = input.nextInt();
    
    sum += number;

        }

    double average = (double) sum / 3;
   

    

    System.out.println ("The average of the numbers are  " + average);


            

        }

    }
