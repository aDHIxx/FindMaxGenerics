public class findMaxTest {

    public static void main(String[] args) {
        findMax<Integer> findMaxInt = new findMax<>();

        // Test Case 1: Max Number at 1st
        int result1 = findMaxInt.findMax(1, 3, 2);
        assert result1 == 5 : "Test Case 1 Failed";

        // Test Case 2: Max Number at 2nd
        int result2 = findMaxInt.findMax(1, 8, 6);
        assert result2 == 8 : "Test Case 2 Failed";

        // Test Case 3: Max Number at 3rd
        int result3 = findMaxInt.findMax(4, 2, 9);
        assert result3 == 9 : "Test Case 3 Failed";

        System.out.println("All test cases passed!");
    }
}

