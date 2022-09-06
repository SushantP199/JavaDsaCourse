
public class Q4 {
    
    public static int totalWaterTrapped (int[] height) {

        int[] leftMaximumBoundary = new int[height.length];

        leftMaximumBoundary[0] = height[0];

        for (int i = 1; i < leftMaximumBoundary.length; i++) {
            leftMaximumBoundary[i] = Math.max(leftMaximumBoundary[i - 1], height[i]);
        }

        int[] rightMaximumBoundary = new int[height.length];

        rightMaximumBoundary[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0 ; i--) {
            rightMaximumBoundary[i] = Math.max(height[i], rightMaximumBoundary[i + 1]);
        }

        int totalWaterTrapped = 0;

        for (int i = 0; i < height.length; i++) {
            int waterLevelOnCurrentBar = Math.min(leftMaximumBoundary[i], rightMaximumBoundary[i]);

            int waterTrappedOnCurrentBar =  waterLevelOnCurrentBar - height[i];

            totalWaterTrapped = totalWaterTrapped + waterTrappedOnCurrentBar;
        }

        return totalWaterTrapped;
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4, 2, 0, 3, 2, 5};

        System.out.print("Array : ");
        displayArray(height);

        int totalRainWaterTrapped = totalWaterTrapped(height);

        System.out.println("Total Rain Water Trapped On Bars Of Given Heights Is " + totalRainWaterTrapped);
    }
}
