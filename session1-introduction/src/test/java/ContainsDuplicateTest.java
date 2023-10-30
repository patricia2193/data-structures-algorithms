import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        assertFalse(Arrays.containsDuplicate(emptyArray));
    }

    @Test
    public void testOneElementArray() {
        int[] oneElementArray = {1};
        assertFalse(Arrays.containsDuplicate(oneElementArray));
    }

    @Test
    public void testOnlyOneDuplicate() {
        int[] oneDuplicateArray = {1, 2, 1};
        assertTrue(Arrays.containsDuplicate(oneDuplicateArray));
    }

    @Test
    public void testMultipleDuplicates() {
        int[] oneDuplicateArray = {1, 2, 1, 3, 2};
        assertTrue(Arrays.containsDuplicate(oneDuplicateArray));
    }
}
