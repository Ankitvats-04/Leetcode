/*class Solution {
    public int unequalTriplets(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;

            while (j < nums.length - 1) {

                int k = j + 1;

                while (k < nums.length) {
                     if (nums[i] != nums[j] &&
                        nums[i] != nums[k] &&
                        nums[j] != nums[k]) {

                        count++;
                    }

                    k++;
                }

                j++;
            }
        }
        return count;
    }
}*/

// Using frequency:
class Solution {
    public int unequalTriplets(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int left=0;
        int count =0;
        for(int num:map.values()){
            int right = nums.length-left-num;
            count+=left*num*right;
            left = left+num;
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna