class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] old = new int[nums.length/2];
        int[] even = new int[(nums.length+1)/2];
        int e = 0;
        int o = 0;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even[e] = nums[i];
                e++;
            }
            else{
                old[o] = nums[i];
                o++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(old);
        e=0;
        o=old.length-1;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = even[e];
                e++;
            }
            else{
                nums[i] = old[o];
                o--;
            }
        }
        return nums;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna