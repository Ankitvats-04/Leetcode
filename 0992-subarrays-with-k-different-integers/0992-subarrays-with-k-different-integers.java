class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add nums[right]
            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            // Too many distinct numbers
            while (map.size() > k) {

                map.put(nums[left],
                        map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Number of valid subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna