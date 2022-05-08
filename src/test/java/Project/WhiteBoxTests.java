package Project;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhiteBoxTests {

    private static String name;

    @Test
    public void Test4lettername() {
        name = "Test";
        assertTrue(helpclass.validateNameLength(name));
    }
    @Test
    public void Test5lettername(){
        name = "Tests";
        assertFalse(helpclass.validateNameLength(name));
    }

}