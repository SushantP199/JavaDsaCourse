
public class PairsInAnArray {
    
    public static void printPairsInAnArray(int[] array) {

        // int totalPairs = 0;

        for (int index = 0, lastIndex = array.length - 1; index <= lastIndex - 1; index++) {
            
            for (int nextIndex = index + 1; nextIndex <= lastIndex; nextIndex++) {
                
                System.out.print("(" + array[index] + ", " + array[nextIndex] +")  ");

                // totalPairs = totalPairs + 1;
            }

            System.out.println();
        }

        // System.out.println("Total number of pairs found : " + totalPairs);

        /*
            If Interviewer asked, To find total number of pairs can be founnd simply use :

                                     array.length ( array.length - 1)
            Total number of pairs = ----------------------------------
                                                    2

            i.e. sum of first n numbers in arithmetic progression (two consecutive number differ by constant difference throghout series of numbers)
            is, sum = n * (n + 1) / 2

            so why we n * (n - 1) / 2 instead of above

            For given array 2, 4, 6, 8, 10 of 5 numbers,
            pairs found in count 4, 3, 2, 1 
            i.e. for 5 numbers 1, 2, 3, 4
            
            in general

            for given array of n numbers,
            pairs found in count n-1, n-2, n-3, ..., 1
            i.e. for n numbers 1, 2, 3, ..., n-1

            so, actual sum should done from 1 to n-1 for array of n numbers
            sum of first n-1 numbers derived as,

            sum = n * (n + 1) / 2
                = (n - 1) * (n - 1 + 1) / 2
                = (n - 1) * (n + 0) / 2
                = (n - 1) * n / 2
            sum = n * (n - 1) / 2

            hence,
            Total number of pairs = array.length * (array.length - 1) / 2       ....(as n = array.length)
        */      
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] array = new int[] {2, 4, 6, 8, 10};
        System.out.print("array : ");
        displayArray(array);

        printPairsInAnArray(array);

        int totalPairs = array.length * (array.length - 1) / 2;
        System.out.println("Total number of pairs found : " + totalPairs);
    }
}
