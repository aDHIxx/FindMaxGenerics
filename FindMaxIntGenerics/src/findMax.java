import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class findMax<T extends Comparable<T>> {

    private T[] values;

    /*
     * @name: findMax
     * @desc: Parameter constructor for findMax class.
     * @param: T... values
     */
    public findMax(T... values) {
        this.values = values;
    }

    /*
     * @name: findMaxValue
     * @desc: Static method to find the largest of Comparable values using options and sorting.
     * @return: Optional<T> max
     */
    public Optional<T> findMaxValue() {
        if (values.length == 0) {
            return Optional.empty();
        }

        // Use sorting to find the maximum
        Arrays.sort(values, Comparator.reverseOrder());

        // Return the maximum value
        return Optional.of(values[0]);
    }
}
