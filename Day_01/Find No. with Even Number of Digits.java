class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            int digits = 0;
            int temp = num;
            
            // Count digits using division
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            
            // Check if digits are even
            if (digits % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
