import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ContactInfoAppTest     {

@Test

    public void testAddContactIsWorking()       {

    String[] input = {"John", "Adam", "08183215687"};

    String[] expected = {"John", "Adam", "08183215687"};

    String[] actual = ContactInfoApp.addContact(input[0], input[1], input[2]);

    assertArrayEquals (expected, actual);

        }


    }
