class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<List<Integer>> set = new HashSet<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % p == 0) {
                count++;
            }
            while (count > k) {

                if (nums[left] % p == 0) {
                    count--;
                }

                left++;
            }

            for (int i = left; i <= right; i++) {

                List<Integer> subarray = new ArrayList<>();

                for (int j = i; j <= right; j++) {
                    subarray.add(nums[j]);
                }

                set.add(subarray);
            }
        }

        return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna