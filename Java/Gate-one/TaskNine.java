import java.util.Scanner;

public class TaskNine      {

    public static void main (String[] args)     {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println  ("enter price of the item");
    double price = input.nextDouble();

    double tax = 0.1 * price;

    double totalPrice = price + tax;

    

    System.out.println ("The total price (tax inclusive is) " + totalPrice);


            

        }

    }
