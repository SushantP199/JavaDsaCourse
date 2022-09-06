
public class ReverseAnArray {
    
    public static void reverseArray(int[] array) {

        for (int index = 0, lastIndex = array.length - 1; index < lastIndex; index++, lastIndex--) {
            int temporaryValue = array[index];
            array[index] = array[lastIndex];
            array[lastIndex] = temporaryValue;
        }

        /*
            just for reference don't use if it is seems less readable 
            as both code won't affect performance in wide difference

            for (int index = 0; index < array.length / 2; index++) {
                int temporaryValue = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temporaryValue;
            }
        */
        
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] array = {2, 4, 6, 8, 9};
        System.out.print("array : ");
        displayArray(array);

        reverseArray(array);
        System.out.print("reverse array : ");
        displayArray(array);
    }
}
