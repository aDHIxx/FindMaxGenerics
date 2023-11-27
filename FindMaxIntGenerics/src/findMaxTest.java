public class findMaxTest {

    public static void main(String[] args) {

        System.out.println("Integer Test Cases");

        // Test Case 1: Max at 1st position
        Integer t1Int1 = 3;
        Integer t1Int2 = 2;
        Integer t1Int3 = 1;
        testMaxAtPosition("Test Case 1", t1Int1, t1Int2, t1Int3);

        // Test Case 2: Max at 2nd position
        Integer t2Int1 = 4;
        Integer t2Int2 = 5;
        Integer t2Int3 = 3;
        testMaxAtPosition("Test Case 2", t2Int1, t2Int2, t2Int3);

        // Test Case 3: Max at 3rd position
        Integer t3Int1 = 6;
        Integer t3Int2 = 7;
        Integer t3Int3 = 8;
        testMaxAtPosition("Test Case 3", t3Int1, t3Int2, t3Int3);

        System.out.println("Float Test Cases");

        // Test Case 1: Max at 1st position
        Float t1Float1 = 3.5f;
        Float t1Float2 = 2.2f;
        Float t1Float3 = 1.0f;
        testMaxAtPosition("Test Case 1", t1Float1, t1Float2, t1Float3);

        // Test Case 2: Max at 2nd position
        Float t2Float1 = 4.8f;
        Float t2Float2 = 5.5f;
        Float t2Float3 = 3.1f;
        testMaxAtPosition("Test Case 2", t2Float1, t2Float2, t2Float3);

        // Test Case 3: Max at 3rd position
        Float t3Float1 = 6.7f;
        Float t3Float2 = 7.2f;
        Float t3Float3 = 8.0f;
        testMaxAtPosition("Test Case 3", t3Float1, t3Float2, t3Float3);

        // Test Case 1: Max at 1st position
        String test1Str1 = "Apple";
        String test1Str2 = "Peach";
        String test1Str3 = "Banana";
        testMaxAtPosition("Test Case 1", test1Str1, test1Str2, test1Str3);

        // Test Case 2: Max at 2nd position
        String test2Str1 = "Cherry";
        String test2Str2 = "Grapes";
        String test2Str3 = "Apple";
        testMaxAtPosition("Test Case 2", test2Str1, test2Str2, test2Str3);

        // Test Case 3: Max at 3rd position
        String test3Str1 = "Orange";
        String test3Str2 = "Lemon";
        String test3Str3 = "Strawberry";
        testMaxAtPosition("Test Case 3", test3Str1, test3Str2, test3Str3);
    }

    /*
     * @name: testMaxAtPosition
     * @desc: takes in 3 integers and returns the largest of the 3.
     * @param: String testName, Integer int1, Integer int2, Integer int3
     * @return: void
     */
    private static void testMaxAtPosition(String testName, Integer int1, Integer int2, Integer int3) {
        Integer result = findMax.findMaxInt(int1, int2, int3);
        System.out.println(testName + " - Max: " + result);
    }
    /*
     * @name: testMaxAtPosition
     * @desc: takes in 3 floats and returns the largest of the 3.
     * @param: String testName, Float float1, Float float2, Float float3
     * @return: void
     */
    private static void testMaxAtPosition(String testName, Float float1, Float float2, Float float3) {
        Float result = findMax.findMaxFloat(float1, float2, float3);
        System.out.println(testName + " - Max: " + result);
    }
    /*
     * @name: testMaxStringAtPosition
     * @desc: takes in 3 strings and prints the lexicographically largest of the 3.
     * @param: String testName, String str1, String str2, String str3
     * @return: void
     */
    private static void testMaxAtPosition(String testName, String str1, String str2, String str3) {
        String result = findMax.findMaxString(str1, str2, str3);
        System.out.println(testName + " - Max: " + result);
    }
}

