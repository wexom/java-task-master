package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(final int[] input) {
        long start = System.currentTimeMillis();

        if (input == null) return new int[0];

        int n = input.length, left = 0, right = n - 1;

        int[] result = new int[n];

        for (int index = n - 1; index >= 0; index--) {
            if (Math.abs(input[left]) > input[right]) {
                result[index] = input[left] * input[left];
                left++;
            } else {
                result[index] = input[right] * input[right];
                right--;
            }
        }

        System.out.printf("Array size: %d. Squared and sorted in %d milliseconds.%n", input.length, System.currentTimeMillis() - start);

        return result;
    }
}
