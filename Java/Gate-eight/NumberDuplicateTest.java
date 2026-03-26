import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberDuplicateTest {

    @Test
    public void testForDuplicateNumberRemoval() {

        int[] input = {9, 2, 3, 2, 1};
        int[] expected = {9, 3, 1};

        int[] actual = NumberDuplicate.duplicateNumbers(input);

        assertArrayEquals(expected, actual);
    }
}
