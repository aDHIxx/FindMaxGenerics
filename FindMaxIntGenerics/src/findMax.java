/*
 *@name: findMax
 * @description: takes in 3 integers and returns the largest of the 3.
 */
public class findMax {
    /*
     * @name: findMaxInt
     * @desc: takes in 3 integers and returns the largest of the 3.
     * @param: Integer num1, Integer num2, Integer num3
     * @return: Integer max
     */
    public static Integer findMaxInt(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    /*
     * @name: findMaxFloat
     * @desc: takes in 3 floats and returns the largest of the 3.
     * @param: Float num1, Float num2, Float num3
     * @return: Float max
     */
    public static Float findMaxFloat(Float num1, Float num2, Float num3) {
        Float max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }
    /*
     * @name: findMaxString
     * @desc: takes in 3 strings and returns the largest of the 3.
     * @param: String str1, String str2, String str3
     * @return: String max
     */
    public static String findMaxString(String str1, String str2, String str3) {
        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }

        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        return max;
    }
}