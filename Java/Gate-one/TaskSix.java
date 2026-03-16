import java.util.Scanner;

public class TaskSix       {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println  ("enter length of the triangle");
    int length = input.nextInt();

    System.out.println  ("enter width of the triangle");
    int width = input.nextInt();
    
    int area = length * width;

    System.out.println ("The area of the rectangle is " + area);


            

        }

    }
