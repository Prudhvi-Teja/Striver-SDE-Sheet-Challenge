class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(nums==null || len<=1) return;
        int i = len-2;

        while( i >=0 && nums[i] >= nums[i+1]) i--;

        if(i >= 0){
            int j = len-1;
            while(nums[j] <= nums[i]) j--;
            swapArr(nums,i,j);
        }
       
        i = i+1;
        int j = len-1;
        while(i < j) swapArr(nums, i++ , j--);


    }

    public void swapArr(int[] nums, int index1, int index2){
         int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
