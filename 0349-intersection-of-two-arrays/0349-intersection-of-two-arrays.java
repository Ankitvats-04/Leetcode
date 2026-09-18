class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet <Integer> set = new HashSet<>();
      HashSet <Integer> result = new HashSet<>();

      for(int val:nums1){
        set.add(val);
      }
      for(int val:nums2){
        if(set.contains(val)){
            result.add(val);
        }
      }

      int[] ans = new int[result.size()];
      int i =0;
      for(int val:result){
        ans[i] = val;
        i++;
      }
      return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna