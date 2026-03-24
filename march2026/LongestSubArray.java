public class LongestSubArray {
    public static void main(String[] args) {
        int[] num = {1,12,-5,-6,50,3};
        int k=4;

        Solution sol = new Solution();
        int product = sol.maxSum(num,k);
        System.out.println(product);
    }
    
}
class Solution {
   public int maxSum(int[] nums, int k) {
    int max = 0, windowSum = 0;
    for (int i = 0; i < nums.length; i++) {
        // 1. Add current element to window
        windowSum += nums[i];

        // 2. Once window reaches size K, start sliding
        if (i >= k - 1) {
            max = Math.max(max, windowSum);
            // 3. Remove the element falling out of the window (left side)
            windowSum -= nums[i - k + 1];
        }
    }
    return max;
}
 
}
