package pruebas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void testSize() {
        int[] arr = {1,2,3};
        Array a = new Array(arr);
        assertEquals(3,a.size());
    }

    @Test
    public void testToString() {
        int[] arr = {1,2,3};
        Array a = new Array(arr);
        assertEquals("1;2;3", a.toString());
    }

    @Test
    public void testSetElementAt() {
        int[] arr = {1,2,3};
        Array a = new Array(arr);
        a.setElementAt(100,2);

        int[] obt = a.getArray();
        assertEquals(obt[2],100);

        try {
            a.setElementAt(100, -1);
            assertFalse(true);
        }
        catch (Exception e) {
            assertTrue(true);
        }
    }
}