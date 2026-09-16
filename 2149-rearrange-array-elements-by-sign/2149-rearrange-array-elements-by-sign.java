class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int[] positive = new int[n];
        int [] negative  = new int[n];
        int j=0;
        int k=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                positive[j] = nums[i];
                j++;
            }
            else{
                negative[k] = nums[i];
                k++;
            }
        }

        j=0;
        k=0;
        for(int i=0; i<nums.length; i++){
            if(i%2!=0){
                nums[i] = negative[j];
                j++;
            }
            else{
                nums[i] = positive[k];
                k++;
            }
        }
        return nums;



        

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna