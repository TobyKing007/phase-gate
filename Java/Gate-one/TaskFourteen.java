import java.util.Scanner;

public class TaskFifteen      {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);

    int larger = 0;
    int number = 0;

    for (int count = 0; count < 2; count++)     {
    
    System.out.println  ("enter number");
    number = input.nextInt();

    if (number > largest)        {
        larger = number;
        
    }

    
}

    System.out.println ("Larger number is " + largest);

    


            

        }

    }
