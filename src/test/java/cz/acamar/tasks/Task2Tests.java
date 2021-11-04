package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Tests {

    private final Task2 task2 = new Task2();

    @Test
    void test_case1() {
        final int[] input = new int[]{-4, -1, 0, 3, 10};
        final int[] expected = new int[]{0, 1, 9, 16, 100};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case2() {
        final int[] input = new int[]{-7, -3, 2, 3, 11};
        final int[] expected = new int[]{4, 9, 9, 49, 121};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case3() {
        final int[] input = null;
        final int[] expected = new int[0];

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case4() {
        final int[] input = new int[]{-2, -1, 0, 0, 1, 2};
        final int[] expected = new int[]{0, 0, 1, 1, 4, 4};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case5_performance() {
        final int size = 499999999, min = 0, range = size - min + 1;
        final int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            final int positiveValue = (int) (Math.random() * range) + min;
            final int sign = Double.compare(Math.random(), 0.5d);
            if (sign == -1) {
                input[i] = -1 * positiveValue;
            } else {
                input[i] = positiveValue;
            }
        }

        final int[] sortedInput = Arrays.stream(input).sorted().toArray();

        int[] result = task2.squaresOfSortedArray(sortedInput);

        assertEquals(size, result.length);
    }

}
