
public class ElementsInAnArrayAreDistinct {

    // Brute Force Approach
    public static boolean anyValueAppearsAtLeastTwiceInAnArray (int[] array) {

        boolean anyValueAppearsAtLeastTwice = false;

        for (int i = 0; i < array.length; i++) {
            
            for (int j = i + 1; j < array.length; j++) {
                
                if (array[i] == array[j]) {
                    anyValueAppearsAtLeastTwice = true;
                    break;
                }
            }
        }

        return anyValueAppearsAtLeastTwice;
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        // int[] array = {1, 2, 3, 1};
        // int[] array = {1, 2, 3, 4};
        int[] array = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.print("Array : ");
        displayArray(array);

        boolean anyValueAppearsAtLeastTwiceInAnArray = anyValueAppearsAtLeastTwiceInAnArray(array);

        System.out.println("Is Any Value Appears At Least Twice In Above Array : " + anyValueAppearsAtLeastTwiceInAnArray);
    }
}
