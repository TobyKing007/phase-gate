import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LevelFiveFunctionTest      {

@Test

public void testSortPrimeNumbers()       {

    int[] input = {5, 9, 3, 6, 2};

    int[] expected = {5,3, 2};

    int[] actual = LevelFiveFunction.sortArrayPrime(input);
    
    assertArrayEquals (expected, actual);


       }


    @Test

public void testNegativeNumbersReplacement()       {

    int[] input = {5, -9, 3, -6, 2, -11};

    int[] expected = {5, 0, 3, 0, 2, 0};

    int[] actual = LevelFiveFunction.replaceNagativeNumbers(input);
    
    assertArrayEquals (expected, actual);


       }

 @Test
public void testRearrangeArray()       {

    int[] input = {5, 0, 3, 0, 2, 0};

    int[] expected = {5, 3, 2, 0, 0, 0};

    int[] actual = LevelFiveFunction.rearrangeArray(input);
    
    assertArrayEquals (expected, actual);


       }




@Test
public void testFindEvenNumbers()       {

    int[] input = {45, 60, 3, 10, 9, 22};

    int[] expected = {60, 10, 22};

    int[] actual = LevelFiveFunction.evenArray(input);
    
    assertArrayEquals (expected, actual);


       }

@Test
public void testFindOddNumbers()       {

    int[] input = {45, 60, 3, 10, 9, 22};

    int[] expected = {45, 3, 9};

    int[] actual = LevelFiveFunction.oddArray(input);
    
    assertArrayEquals (expected, actual);


       }


@Test
public void testIsPalindromeArray()       {

    int[] input = {45, 0, 8, 0, 45};
    
    assertTrue(LevelFiveFunction.findPalindromeArray(input));

}

@Test
public void testIsNotPalindromeArray()       {

    int[] input = {1, 2, 3, 4, 5};
    
    assertFalse(LevelFiveFunction.findPalindromeArray(input));

}

@Test
public void testFindPerfectSquares()       {

    int[] input = {4, 7, 9, 10, 16, 18};

    int[] expected = {4, 9, 16};

    int[] actual = LevelFiveFunction.findPerfectSquares(input);
    
    assertArrayEquals (expected, actual);


       }

















    }
