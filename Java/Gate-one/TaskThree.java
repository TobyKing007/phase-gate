import java.util.Scanner;

public class TaskThree        {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    int sum = 0;
    for (int count = 0; count < 2; count++)     {
    System.out.println  ("Enter number");
    int number = input.nextInt();
    sum += number;

        }

   

    System.out.println ("The sum is " + sum);


            

        }

    }
