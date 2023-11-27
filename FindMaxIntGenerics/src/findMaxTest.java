public class findMaxTest {

    public static void main(String[] args) {

        // Test Case 1: Max at 1st position (Integer)
        Integer t1Int1 = 3;
        Integer t1Int2 = 2;
        Integer t1Int3 = 1;
        testMaxAtPosition("Test Case 1", t1Int1, t1Int2, t1Int3);

        // Test Case 2: Max at 2nd position (Float)
        Float t2Float1 = 4.8f;
        Float t2Float2 = 5.5f;
        Float t2Float3 = 3.1f;
        testMaxAtPosition("Test Case 2", t2Float1, t2Float2, t2Float3);

        // Test Case 3: Max at 3rd position (String)
        String t3Str1 = "Apple";
        String t3Str2 = "Peach";
        String t3Str3 = "Banana";
        testMaxAtPosition("Test Case 3", t3Str1, t3Str2, t3Str3);
    }

    /*
     * @name: testMaxAtPosition
     * @desc: takes in 3 values of a Comparable type and prints the largest of the 3.
     * @param: String testName, T val1, T val2, T val3
     * @return: void
     */
    private static <T extends Comparable<T>> void testMaxAtPosition(String testName, T val1, T val2, T val3) {
        T result = findMax.findMax(val1, val2, val3);
        System.out.println(testName + " - Max: " + result);
    }
}

