/*
 * @name: findMax
 * @desc: Generic class that takes in 3 values of a Comparable type and provides methods to find the maximum.
 */
class findMax<T extends Comparable<T>> {

    T val1;
    T val2;
    T val3;

    /*
     * @name: findMax
     * @desc: Parameter constructor for findMax class.
     * @param: T val1, T val2, T val3
     */
    findMax(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    /*
     * @name: findMaxValue
     * @desc: Static method to find the largest of three Comparable values.
     * @param: T val1, T val2, T val3
     * @return: T max
     */
    static <T extends Comparable<T>> T findMaxValue(T val1, T val2, T val3) {
        T max = val1;

        if (val2.compareTo(max) > 0) {
            max = val2;
        }

        if (val3.compareTo(max) > 0) {
            max = val3;
        }

        return max;
    }

    static <T extends Comparable<T>> T testMaximum(T val1, T val2, T val3) {
        return findMaxValue(val1, val2, val3);
    }
}