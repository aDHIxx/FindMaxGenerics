import java.util.Optional;
/*
 * @name: findMaxTest
 * @desc: Test class for findMax class. */
public class findMaxTest {

    public static void main(String[] args) {
        // Test Case 1: Max with more than three parameters (Integer)
        findMax<Integer> t1Int = new findMax<>(3, 2, 1, 4, 5, 6);
        testMax("Test Case 1", t1Int);

        // Test Case 2: Max with more than three parameters (Double)
        findMax<Double> t2Double = new findMax<>(4.8, 5.5, 3.1, 7.2, 6.6);
        testMax("Test Case 2", t2Double);

        // Test Case 3: Max with more than three parameters (String)
        findMax<String> t3StrMaxFinder = new findMax<>("Apple", "Peach", "Banana", "Orange", "Grapes");
        testMax("Test Case 3", t3StrMaxFinder);
    }

    /*
     * @name: testMax
     * @desc: print the result of findMaxValue method.
     * @param: String testName, findMax<T> maxFinder
     * @return: void
     */
    private static <T extends Comparable<T>> void testMax(String testName, findMax<T> maxFinder) {
        Optional<T> result = maxFinder.findMaxValue();
        if (result.isPresent()) {
            System.out.println(testName + " - Max: " + result.get());
        } else {
            System.out.println(testName + " - No values provided.");
        }
    }
}