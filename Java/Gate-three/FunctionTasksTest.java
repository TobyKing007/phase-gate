import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FunctionTasksTest      {

@Test
    public static testForArrayLength()      {

    int[] array = {10, 11, 12};

    int[] expeced = {10, 11, 12, -1, -1};

    int[] actual = FunctionTasks.increaseArrayLength;

    assertArrayEquals = (expected, actual(array));


                }

@Test
    public static ArrayTest()    {

    String input = "AaaBBc";

    String expected = "A1a2B2c1";

    String actual = FunctionTasks.letter;

    assertEquals (expected, actual(input));

        }

@Test
    public static testMultiDimensionalArray()     {

    double[][] input = {45.2, 90.28, 77.1}, {3.52, 9.86, 11.77}, {7.7, 10, 22.33, 12};

    double[] expected = {0, 1};

    double actual = FunctionTasks.multiDimensionalArray;

    assertEquals (expected, actual(input));
        }
    
    }
            
