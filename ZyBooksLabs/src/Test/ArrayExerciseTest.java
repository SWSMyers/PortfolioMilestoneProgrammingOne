package Test;
import...
public class ArrayExerciseTest {

    ArrayExercise arrayExercise = new ArrayExercise();

    @Test
    public void testArrayToUpperCase() {
        String[] input = new String[]{"cat","dog", "fish"};
        arrayExercise.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }


    public void getTestArrayToUpperCase90() {
        public void testIncrementArray() {
            int[] input = new int[] {1, 2, 3, 4, 5};
            arrayExercise.incrementArray(input);
            assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);
        }
    }
}
