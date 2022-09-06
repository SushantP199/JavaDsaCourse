
public class Q2 {
    
    // Naive Approach : Linear Search
    public static int indexOfTarget (int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // int[] array = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        // int[] array = {4, 5, 6, 7, 0, 1, 2};
        // int target = 3;
        int[] array = {1};
        int target = 0;

        System.out.print("Array : ");
        displayArray(array);
        System.out.println("Target = " + target);

        System.out.println("Index Of Target : " + indexOfTarget(array, target));
    }
}
