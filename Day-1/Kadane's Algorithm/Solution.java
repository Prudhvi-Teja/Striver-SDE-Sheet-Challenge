class Solution {

   
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums){
            
            sum += num;
            max = Math.max(max,sum);

            sum = sum < 0 ? 0 : sum;
        }
        
        return max;
    }
}
