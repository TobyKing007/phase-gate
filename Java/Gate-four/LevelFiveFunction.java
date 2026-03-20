public class LevelFiveFunction  {

public static int[] sortArrayPrime (int[] numbers)      {

    int primeCount = 0;

    for (int count = 0; count < numbers.length; count++)       {

        if (isPrime(numbers[count]))      {
            primeCount++;

                        }
                    }


        int[] primeNumbers = new int [primeCount];

        int counter = 0;

         for (int elements = 0; elements < numbers.length; elements++)       {
                    
            if (isPrime(numbers[elements]))      {
                primeNumbers[counter] = numbers[elements];
                counter++;

                        }

                    }
                return primeNumbers;

                }


        public static boolean isPrime(int number) {

        if (number <= 1) 
            return false;

        for (int count = 2; count < number; count++) {
            if (number % count == 0) 
                return false;
        }

        return true;


            }

    public static int[] replaceNagativeNumbers (int[] numbers)        {

    for (int count = 0; count < numbers.length; count++)        {
        if (numbers[count] < 0)      {
            numbers[count] = 0;

                }



            }

        return numbers;
        }

    public static int[] rearrangeArray (int[] numbers)      {
    
    int index = 0;

    for (int count = 0; count < numbers.length; count++)        {
        if (numbers[count] != 0)     {
            numbers[index] = numbers[count];
            index++;
    
                }
        
            }
     while (index < numbers.length)     {
            numbers[index] = 0;
            index++;
    
                    }

        return numbers;
                

                }   

        


public static int[] evenArray (int[] numbers)      {

    int evenCount = 0;
    int oddCount = 0;

    for (int count = 0; count < numbers.length; count++)        {
        if (numbers[count] % 2 == 0)
            evenCount++;

                }

     int[] evenNumbers = new int [evenCount];

    int index = 0;

     for (int count = 0; count < numbers.length; count++)       {

        if (numbers[count] % 2 == 0)        {
            evenNumbers[index] = numbers[count]; 
            index++;

                    }
        


                }

        return evenNumbers;

            }

public static int[] oddArray (int[] numbers)      {

    
    int oddCount = 0;

    for (int count = 0; count < numbers.length; count++)        {
        if (numbers[count] % 2 == 1)
            oddCount++;

                }

     int[] oddNumbers = new int [oddCount];

    int index = 0;

     for (int count = 0; count < numbers.length; count++)       {

        if (numbers[count] % 2 == 1)        {
            oddNumbers[index] = numbers[count]; 
            index++;

                    }
        


                }
        return oddNumbers;
            }


 public static boolean findPalindromeArray (int[] numbers) {

        int left = 0;                      
        int right = numbers.length - 1;    

        while (left < right) {
            if (numbers[left] != numbers[right]) {
                return false;             
            }
            left++;
            right--;
        }

        return true;                       
    }

public static int[] findPerfectSquares (int[] numbers)

    int count = 0;

    for (int counter = 0; counter < numbers.length; counter++)  `{
        


            }





































    }

        
