import java.util.Scanner;

public class TaskFifteen      {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);

    int largest = 0;
    int number = 0;

    for (int count = 0; count < 3; count++)     {
    
    System.out.println  ("enter number");
    number = input.nextInt();

    if (number > largest)        {
        largest = number;
        
    }

    
}

    System.out.println ("Largest is " + largest);

    


            

        }

    }
