import java.util.Scanner;

public class TaskFive       {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println  ("Enter degree in celcius");
    double celcius = input.nextDouble();
    
    double fahrenheit = (celcius * 9/5) + 32;

    System.out.println ("The degree in fahrenheit is  " + fahrenheit);


            

        }

    }
