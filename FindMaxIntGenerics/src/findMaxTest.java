public class findMaxTest {

    public static void main(String[] args) {

        // Test Case 1: Max at 1st position (Integer)
        findMax<Integer> t1Int = new findMax<>(3, 2, 1);
        testMaxAtPosition("Test Case 1", t1Int);

        // Test Case 2: Max at 2nd position (Float)
        findMax<Float> t2Float = new findMax<>(4.8f, 5.5f, 3.1f);
        testMaxAtPosition("Test Case 2", t2Float);

        // Test Case 3: Max at 3rd position (String)
        findMax<String> t3StrMaxFinder = new findMax<>("Apple", "Peach", "Banana");
        testMaxAtPosition("Test Case 3", t3StrMaxFinder);
    }

    /*
     * @name: testMaxAtPosition
     * @desc: Method to print the result of testMaximum method.
     * @param: String testName, findMax<T> maxFinder
     * @return: void
     */
    private static <T extends Comparable<T>> void testMaxAtPosition(String testName, findMax<T> maxFinder) {
        T result = findMax.testMaximum(maxFinder.val1, maxFinder.val2, maxFinder.val3);
        System.out.println(testName + " - Max: " + result);
    }
}