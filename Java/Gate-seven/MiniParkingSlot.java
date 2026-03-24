import java.util.Scanner;

public class MiniParkingSlot    {

    static int[] parkingSlots = new int [20];


    public static int toParkCar()      {
    
    for (int count = 0; count < parkingSlots.length; count++)       {

// 0 = empty, 1 = spot taken

    if (parkingSlots[count] == 0)      {

        parkingSlots[count] = 1;

        System.out.println ("Your car has been parked at slot " + (count + 1));

        return count + 1;

                        }

   
                    }

        
        System.out.println (" parking slot is full");

        return -1;
                        


                }

    public static int chooseSlotNumber (int slotNumber)     {

    if (slotNumber < 1 || slotNumber > 20)      {

        System.out.println ("invalid slot number");

        return -1;
                        }

    if (parkingSlots[slotNumber - 1] == 0)       {

        parkingSlots[slotNumber - 1] = 1;

        System.out.println ("Your car is parked at slot " + slotNumber);

        return slotNumber;

                    }

        else    {

        System.out.println ("Slot already occupied");
        return -1;

                    }
                }

    public static int removeCar (int slotNumber)       {

     if (slotNumber < 1 || slotNumber > 20)      {

        System.out.println ("invalid slot number");
        return -1;

        
                        }


    if (parkingSlots[slotNumber - 1] == 1)       {

        parkingSlots[slotNumber - 1] = 0;

        System.out.println ("Car romoved at slot " + slotNumber);

        return slotNumber;

                    }

        else    {

        System.out.println ("Slot already empty");
        return -1;

                    }


             }

    public static void displaySlotsStatus()       {

    System.out.println ("\n Parking slot status");

    for (int count = 0; count < parkingSlots.length; count++)       {
    
        System.out.print(parkingSlots[count] + " ");
                    }

        int empty = 0;
        int occupied = 0;

    for (int counter : parkingSlots)        {

        if (counter == 0)       {
            empty++;

        }

        else    {

           occupied++;
                }                        

                    }

    
    System.out.println("\n Empty slot(s) remaining is " + empty);
    System.out.println("\n Occupied slot(s) is " + occupied);

                }


        
    public static void main (String[] args)     {

    Scanner input = new Scanner (System.in);



    while (true)        {
    
    System.out.println ("1. park");
    System.out.println ("2. choose your slot");
    System.out.println ("3. remove car");
    System.out.println ("4. Dsplay status");
    System.out.println ("5. Exit");

    System.out.println ("Choose an option");
    int option = input.nextInt();

    switch (option)     {
        case 1: 
            toParkCar();
           
            break;

        case 2:
            System.out.println ("Enter a slot number (1 - 20)");
            int slot = input.nextInt();
            chooseSlotNumber(slot);
            
            break;


        case 3:
            System.out.println ("Enter your parking slot number");
            int slotNumber = input.nextInt();
            removeCar(slotNumber);
            
            break;

        case 4:
            displaySlotsStatus();
            break;

        case 5:
            System.out.print("Thank you! Goodbye");
            return;

        default:
            System.out.print("invalid option");             
    
            
                        }
                    }

                }










         }

        
