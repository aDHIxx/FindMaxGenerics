public class findMaxTest {

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        Integer t1Num1 = 3;
        Integer t1Num2 = 2;
        Integer t1Num3 = 1;
        testMaxAtPosition("Test Case 1", t1Num1, t1Num2, t1Num3);

        // Test Case 2: Max at 2nd position
        Integer t2Num1 = 4;
        Integer t2Num2 = 5;
        Integer t2Num3 = 3;
        testMaxAtPosition("Test Case 2", t2Num1, t2Num2, t2Num3);

        // Test Case 3: Max at 3rd position
        Integer t3Num1 = 6;
        Integer t3Num2 = 7;
        Integer t3Num3 = 8;
        testMaxAtPosition("Test Case 3", t3Num1, t3Num2, t3Num3);
    }

    /*
     * @name: testMaxAtPosition
     * @desc: takes in 3 integers and returns the largest of the 3.
     * @param: String testName, Integer num1, Integer num2, Integer num3
     * @return: void
     */
    private static void testMaxAtPosition(String testName, Integer num1, Integer num2, Integer num3) {
        Integer result = findMax.findMaxInt(num1, num2, num3);
        System.out.println(testName + " - Max: " + result);
    }
}

