public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        // TODO: YOUR CODE HERE
        return null;
    }

    /** 
     * Returns the array of arrays formed by breaking up A into
     *  maximal ascending lists, without reordering.
     */
    public static int[][] naturalRuns(int[] A) {
        // TODO: Your CODE HERE
        return null;
    }

    /*
    * Returns the subarray of A consisting of the LEN items starting
    * at index K.
    */
    public static int[] subarray(int[] A, int k, int len) {
        int[] result = new int[len];
        System.arraycopy(A, k, result, 0, len);
        return result;
    }

}