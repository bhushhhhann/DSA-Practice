class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;
        int high = 0;
        int sum = 0;
        int minimal = nums.length + 1;

        while (high < nums.length) {
            // expand window 
            sum += nums[high];

            // shrink window when sum >= target optimal answer ke liye 
            while (sum >= target) {
                int len = high - low + 1;
                if (minimal > len) {
                    minimal = len;
                }
                sum -= nums[low];
                low++;
            }
            high++;
        }

        if (minimal == nums.length + 1) {
            return 0;
        } else {
            return minimal;
        }
    }
}
