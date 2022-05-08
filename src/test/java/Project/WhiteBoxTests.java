package Project;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhiteBoxTests {

    private static String name;

    @Test
    public void TestNameIs4Letters() {
        name = "Test";
        assertTrue(helpclass.validateNameLength(name));
    }
    @Test
    public void TestNameIs5Letters(){
        name = "Tests";
        assertFalse(helpclass.validateNameLength(name));
    }
    @Test
    public void TestNameHasNumber(){
        name = "Tes1";
        assertTrue(helpclass.validateNameLength(name));
    }
    @Test
    public void TestIs3Letters(){
        name = "Tes";
        assertFalse(helpclass.validateNameLength(name));
    }

}