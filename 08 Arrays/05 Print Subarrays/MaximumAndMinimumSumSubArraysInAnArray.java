
public class MaximumAndMinimumSumSubArraysInAnArray {

    public static void printMaximumAndMinimumInArray(int[] array) {

        int maximum, minimum;

        maximum = minimum = array[0];

        for (int index = 0; index <= array.length - 1; index++) {

            if (array[index] > maximum) {
                maximum = array[index];
            }

            if (array[index] < minimum) {
                minimum = array[index];
            }
        }

        System.out.println("Maximum Sum Sub Array Sum = " + maximum);
        System.out.println("Minimum Sum Sub Array Sum = " + minimum);
    }
    
    public static void printSubArraysInArray (int[] array) {

        int[] subArraysSum = new int[array.length * (array.length + 1) / 2];
        int subArraysSumIndex = 0;

        for (int startIndex = 0; startIndex <= array.length - 1; startIndex++) {
            
            for (int endIndex = startIndex; endIndex <= array.length - 1; endIndex++) {
                
                for (int index = startIndex; index <= endIndex; index++) {
                    
                    System.out.print(array[index] + " ");

                    subArraysSum[subArraysSumIndex] = subArraysSum[subArraysSumIndex] + array[index];
                }

                System.out.print("  ");
                subArraysSumIndex  = subArraysSumIndex + 1;
            }

            System.out.println();
        }

        printMaximumAndMinimumInArray(subArraysSum);
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] array = {2, 4, 6, 8, 10};
        displayArray(array);
        printSubArraysInArray(array);
    }
}
