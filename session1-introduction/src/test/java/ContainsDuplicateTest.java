import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        assertFalse(ArraysExercises.containsDuplicate(emptyArray));
    }

    @Test
    public void testOneElementArray() {
        int[] oneElementArray = {1};
        assertFalse(ArraysExercises.containsDuplicate(oneElementArray));
    }

    @Test
    public void testOnlyOneDuplicate() {
        int[] oneDuplicateArray = {1, 2, 1};
        assertTrue(ArraysExercises.containsDuplicate(oneDuplicateArray));
    }

    @Test
    public void testMultipleDuplicates() {
        int[] oneDuplicateArray = {1, 2, 1, 3, 2};
        assertTrue(ArraysExercises.containsDuplicate(oneDuplicateArray));
    }
}
