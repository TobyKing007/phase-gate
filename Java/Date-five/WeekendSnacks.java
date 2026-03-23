public class WeekendSnacks  {

    public static int countingEvenNumbers (int[] numbers)     {

    int evenCount = 0;

    for (int count = 0; count < numbers.length; count++)        {

        if (numbers[count] % 2 == 0)     {
            evenCount +=1;

                }


            }

        return evenCount;

        }


    public static int returnTargetIndex (int[] numbers, int target)        {
   
     for (int digit = 0; digit < numbers.length; digit++)        {

        if (numbers[digit] == target)        {

            return digit;

                }
            }
            return -1;

        }


    public static int [] squareNumbers (int[] numbers)      {

    int[] squareArray = new int [numbers.length];

    int count = 0;

    for (int digit : numbers)       {

        squareArray[count] = digit * digit;

        count ++;
        

            }

        return squareArray;
        }

    public static boolean compareLengthAndValue (int[] numbersOne, int [] numbersTwo)   {

    if (numbersOne.length != numbersTwo.length)     {

        return false;

            }

        for (int count = 0; count < numbersOne.length; count ++)        {
        
            if (numbersOne[count] != numbersTwo[count])     {

                return false;

                }

            }
                return true;

        }


    public static int[] convertArray (int[][] numbers)      {
        
        int totalLength = 0;

        for (int count = 0; count < numbers.length; count++) {
            totalLength += numbers[count].length;
        }

        
        int[] newArray = new int[totalLength];

       
        int index = 0;

        for (int count = 0; count < numbers.length; count++) {
            for (int counter = 0; counter < numbers[count].length; counter++) {
                newArray[index] = numbers[count][counter];
                index++;
            }
        }

        return newArray;
    }






















    }
