/*
 *@name: findMax
 * @description: takes in 3 valuess and returns the largest of the 3.
 */
public class findMax {
    /*
     * @name: findMax
     * @desc: takes in 3 values of a Comparable type and returns the largest of the 3.
     * @param: T val1, T val2, T val3
     * @return: T max
     */
    public static <T extends Comparable<T>> T findMax(T val1, T val2, T val3) {
        T max = val1;

        if (val2.compareTo(max) > 0) {
            max = val2;
        }

        if (val3.compareTo(max) > 0) {
            max = val3;
        }

        return max;
    }
}