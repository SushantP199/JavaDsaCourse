
class TrappingRainwater {

    // Auxiliary Array Approach
    public static int totalAreaOfRainWaterTrapped(int[] height) {

        int totalBars = height.length;

        // left max boundaries for each bar in auxiliary array
        int[] leftMaximumBoundary = new int[totalBars];

        leftMaximumBoundary[0] = height[0];
        for (int index = 1; index < totalBars; index++) {
            leftMaximumBoundary[index] = Math.max(height[index], leftMaximumBoundary[index - 1]);
        }

        // right max boundaries for each bar in auxiliary array
        int[] rightMaximumBoundary = new int[totalBars];

        rightMaximumBoundary[totalBars - 1] = height[totalBars - 1];
        for (int index = totalBars - 2; index >= 0; index--) {
            rightMaximumBoundary[index] = Math.max(rightMaximumBoundary[index + 1], height[index]);
        }

        // finding total rain water trapped
        int totalRainWaterTrapped = 0;
        for (int index = 0; index <= totalBars - 1; index++) {
            
            int waterLevelOnCurrentBar = Math.min(leftMaximumBoundary[index], rightMaximumBoundary[index]);

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
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        displayArray(height);

        int totalRainWaterTrapped = totalAreaOfRainWaterTrapped(height);

        System.out.println("Total Rain Water Trapped On Bars Of Given Heights Is " + totalRainWaterTrapped);
    }
}