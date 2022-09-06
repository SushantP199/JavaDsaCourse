
public class SubArraysInAnArray {
    
    public static void printSubArraysInAnArray(int[ ] array) {

        for (int startIndex = 0; startIndex <= array.length - 1; startIndex++) {
            
            for (int endIndex = startIndex; endIndex <= array.length - 1; endIndex++) {
                
                for (int index = startIndex; index <= endIndex; index++) {
                    
                    System.out.print(array[index] + " ");
                }

                System.out.print("  ");
            }

            System.out.println();
        }        
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] array = {2, 4, 6, 8, 10};
        System.out.print("array : ");
        displayArray(array);

        printSubArraysInAnArray(array);

        int totalSubArrays = array.length * (array.length + 1) / 2;
        System.out.println("Total number of sub arrays can be created : " + totalSubArrays);
    }
}
