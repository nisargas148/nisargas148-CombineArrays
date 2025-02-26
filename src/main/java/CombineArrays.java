public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {
        // Create a new array with a length equal to the sum of the lengths of arr1 and arr2
        int[] combined = new int[arr1.length + arr2.length];

        // Copy elements from arr1 into the combined array
        System.arraycopy(arr1, 0, combined, 0, arr1.length);

        // Copy elements from arr2 into the combined array, starting where arr1 ends
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        // Return the combined array
        return combined;
    }
}
