public class slidingWindow {
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        MaximumSumSubarray max = new MaximumSumSubarray();
        int result = max.maxSumSubarray(arr, k);
        
        System.out.println("Maximum sum of subarray of size " + k + ": " + result );
        // Output: 9 (subarray [5, 1, 3])
        
        // Visual representation:
        // [2,1,5] = 8
        // [1,5,1] = 7
        // [5,1,3] = 9 ← maximum
        // [1,3,2] = 6
    }
}
class MaximumSumSubarray {
    
    public  int maxSumSubarray(int[] arr, int k) {
        // Edge cases
        if (arr == null || arr.length < k || k <= 0) {
            return -1;
        }
        
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        
        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove leftmost, add rightmost
            windowSum = windowSum - arr[i - k] + arr[i];
            
            // Update maximum
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
    
}