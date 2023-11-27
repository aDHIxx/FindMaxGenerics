/*
 *@name: findMax
 * @description: takes in 3 integers and returns the largest of the 3.
 */
public class findMax {
    /*
     * @name: findMaxInt
     * @description: takes in 3 integers and returns the largest of the 3.
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
}