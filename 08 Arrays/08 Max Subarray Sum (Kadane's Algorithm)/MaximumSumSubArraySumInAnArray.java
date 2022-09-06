
public class MaximumSumSubArraySumInAnArray {
    
    // Kadane's Algorithm Technique
    public static int maximumSumSubArraySumInAnArray (int[] array) {

        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int index = 0; index <= array.length - 1; index++) {

            sum = sum + array[index];

            if (sum < 0) {
                sum = 0;
            }

            /*
                Little tweak in kadane's algorithm 
                to find maximum sum sub array sum if all the numbers in array are negative 
                along with if all the numbers in array are combination of zero, positive and negative numbers

                But Kadane's Algorithm is not applicable if all the numbers in array are negative,
                array should should contains at one non-negative number (i.e. either zero or positive).

                Hence below code can be used to find solution, but in strict frame and respect of 
                Kadane's algorithm we shouldn't use below code and return maximum value of all negative numbers 
                in given array as a maximum sum sub array sum. (As single maximum negative value of single element sub array 
                is the only answer to question if add any other single negative value to it maximum answer will 
                always less than that single maximum negative value of single element sub array in array of all negative numbers) 

                if (sum < array[index]) {
                    sum = array[index];
                }
            */

            if (maximum < sum) {
                maximum = sum;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int[] array = {-2, -3, -4, -1, -2, -1, -5, -3};

        /* 
            Special (Corner) Case : If all the numbers in array are negative
        */ 
        int maximumSumSubArraySumInAnArray = Integer.MIN_VALUE;

        for (int index = 0; index <= array.length - 1; index++) {

            if (array[index] > maximumSumSubArraySumInAnArray) {
                maximumSumSubArraySumInAnArray = array[index];
            }
        }

        if (maximumSumSubArraySumInAnArray > 0) {
            maximumSumSubArraySumInAnArray = maximumSumSubArraySumInAnArray(array);
        }

        System.out.println("Maximum sum sub array sum = " + maximumSumSubArraySumInAnArray);
    }
}
