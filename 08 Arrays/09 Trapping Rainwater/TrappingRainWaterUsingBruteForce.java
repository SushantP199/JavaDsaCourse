
public class TrappingRainWaterUsingBruteForce {
    
    // Brute Force Approach
    public static int totalAreaOfRainWaterTrapped(int[] height) {

        int totalRainWaterTrapped = 0;

        for (int index = 0; index <= height.length - 1; index++) {
            
            int leftMaxBoundary = 0;
            for (int leftBoundary = 0; leftBoundary <= index; leftBoundary++) {
                if (height[leftBoundary] > leftMaxBoundary) {
                    leftMaxBoundary = height[leftBoundary];
                }                
            }

            int rightMaxBoundary = 0;
            for (int rightBoundary = index; rightBoundary <= height.length - 1; rightBoundary++) {
                rightMaxBoundary = Math.max(height[rightBoundary], rightMaxBoundary);
            }

            int waterLevelOnCurrentBar = Math.min(leftMaxBoundary, rightMaxBoundary);

            int waterTrappedOnCurrentBar = waterLevelOnCurrentBar - height[index];

            totalRainWaterTrapped = totalRainWaterTrapped + waterTrappedOnCurrentBar;
        }

        return totalRainWaterTrapped;
    }

    public static void displayArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // int[] height = {4, 2, 0, 6, 3, 2, 5};
        // int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4, 2, 0, 3, 2, 5};

        displayArray(height);

        int totalRainWaterTrapped = totalAreaOfRainWaterTrapped(height);

        System.out.println("Total Rain Water Trapped On Bars Of Given Heights Is " + totalRainWaterTrapped);
    }
}
