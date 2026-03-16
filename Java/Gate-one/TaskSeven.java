import java.util.Scanner;

public class TaskSeven      {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println  ("enter radius of the circle");
    double radius = input.nextDouble();

    double circumference = radius * radius * 3.142;

    

    System.out.println ("The circumference of the circle is " + circumference);


            

        }

    }
