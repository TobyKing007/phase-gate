import java.util.Scanner;

public class TaskFour        {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    int product = 1;
    for (int count = 0; count < 2; count++)     {
    System.out.println  ("Enter number");
    int number = input.nextInt();
    product *= number;

        }

   

    System.out.println ("The product is " + product);


            

        }

    }
