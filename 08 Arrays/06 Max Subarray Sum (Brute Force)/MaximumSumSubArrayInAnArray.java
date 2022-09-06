
class MaximumSumSubArrayInAnArray {

    public static int maximumSumSubArrayInAnArray (int[] array) {

        int maximum = Integer.MIN_VALUE;

        for (int startIndex = 0; startIndex <= array.length - 1; startIndex++) {
            
            for (int endIndex = startIndex; endIndex <= array.length - 1; endIndex++) {
                
                // Brute Force Technique
                int sum = 0;

                for (int index = startIndex; index <= endIndex; index++) {
                    
                    sum = sum + array[index];
                }

                if (sum > maximum) {
                    maximum = sum;
                }
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        
        int[] array = {1, -2, 6, -1, 3};

        int maximumSumSubArrayInAnArray = maximumSumSubArrayInAnArray(array);

        System.out.print("Maximum sum sub array sum = " + maximumSumSubArrayInAnArray);
    }
}