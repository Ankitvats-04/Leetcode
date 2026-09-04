class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxwater = 0;

         while(left<right){
            int width = right-left;
            int h = Math.min(height[left], height[right]);
            int area = width*h;

             maxwater = Math.max(maxwater, area);
             
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }

         }
         return maxwater;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna