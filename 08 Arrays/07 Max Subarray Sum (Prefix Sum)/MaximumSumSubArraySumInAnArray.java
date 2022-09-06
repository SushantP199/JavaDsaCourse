
class MaximumSumSubArraySumInAnArray {

    public static int maximumSumSubArraySumInAnArray (int[] array) {

        // Prefix Sum Technique
        int[] prefixSum = new int[array.length]; // prefix sum array

        prefixSum[0] = array[0];
        for (int index = 1; index <= prefixSum.length - 1; index++) {
            prefixSum[index] = prefixSum[index - 1] + array[index];
        }

        int maximum = Integer.MIN_VALUE;

        for (int startIndex = 0; startIndex <= array.length - 1; startIndex++) {
            
            for (int endIndex = startIndex; endIndex <= array.length - 1; endIndex++) {
                
                // Prefix Sum Technique
                int sum = (startIndex == 0) ? prefixSum[endIndex] : prefixSum[endIndex] - prefixSum[startIndex - 1];
                
                if (sum > maximum) {
                    maximum = sum;
                }
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        
        int[] array = {1, -2, 6, -1, 3};
        
        int maximumSumSubArraySumInAnArray = maximumSumSubArraySumInAnArray(array);

        System.out.println("Maximum sum sub array sum = " + maximumSumSubArraySumInAnArray);
    }
}