class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int val:nums1){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val:nums2){
            if(map.getOrDefault(val,0)>0){
                list.add(val);
                map.put(val, map.get(val)-1);
            }
        }
        int [] result = new int[list.size()];
        int j=0;
        for(int val:list){
            result[j] = val;
            j++;
        }
        return result;
     

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna