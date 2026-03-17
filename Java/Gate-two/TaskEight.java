import java.util.Scanner;


public class TaskEight   {

    public static void main (String[] args)     {

    Scanner input = new Scanner(System.in);

    int sum = 0;

    while (true)        {

    System.out.println ("Enter a number");
    int number = input.nextInt();

    sum += number;

    if (number == 0)        {

        break;
                   }


        
                }

     System.out.println (sum);  

           }

        

       }
    
