import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WeekendSnacksTest      {

@Test
    public void testForEvenNumbers()      {

    int[] numbers = {3, 5, 4, 2, 15, 14, 32, 14, 31, 67};

    int expected = 5;

    int actual = WeekendSnacks.countingEvenNumbers(numbers);

    assertEquals (expected, actual);

                }



@Test
    public void testForFindingTargetNumber()      {

    int[] numbers = {3, 5, 4, 2, 15, 14, 32, 14, 31, 67};

    int target = 14;

    int expected = 5;

    int actual = WeekendSnacks.returnTargetIndex(numbers, target);

    assertEquals (expected, actual);

                }

@Test
    public void testForsquareNumber()      {

    int[] numbers = {3, 5, 4, 2};

    int[] expected = {9,25, 16, 4};

    int[] actual = WeekendSnacks.squareNumbers(numbers);

    assertArrayEquals (expected, actual);

                }


@Test
    public void testForArrayLength()      {

    int[] numbersOne = {3, 5, 4, 2};

    int[] numbersTwo = {3, 5, 4, 2};

    boolean expected = true;

   boolean actual = WeekendSnacks.compareLengthAndValue(numbersOne, numbersTwo);

    assertTrue(actual);

                }



@Test
    public void testForUnequalArrayLength()      {

    int[] numbersOne = {3, 5, 4, 2, 4};

    int[] numbersTwo = {3, 5, 4, 2};

    boolean expected = false;

   boolean actual = WeekendSnacks.compareLengthAndValue(numbersOne, numbersTwo);

    assertFalse(actual);

                }











            }
