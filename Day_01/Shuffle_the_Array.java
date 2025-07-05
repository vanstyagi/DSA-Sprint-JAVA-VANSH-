class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n]; 
        
        int i = 0, j = n; 
        
        for (int k = 0; k < 2 * n; k += 2) {
            result[k] = nums[i];  
            result[k + 1] = nums[j]; 
            i++;
            j++;
        }
        
        return result; 
    }
}
