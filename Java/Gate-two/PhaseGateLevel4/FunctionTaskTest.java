import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class FunctionTaskTest       {


@Test
    public void calculateTotal ()       {
    
    FunctionTask totalTest = new totalTest();

    assertEquals (15, totalTest.Task1(5, 10));
    
            }

        }
