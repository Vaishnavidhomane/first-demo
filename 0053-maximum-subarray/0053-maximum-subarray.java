class Solution {
    public int maxSubArray(int[] nums) {
        int maxarray = nums[0];
        int currentarray = nums[0];
        for(int i=1;i<nums.length;i++){
            currentarray= Math.max (nums[i], nums[i]+currentarray);
            maxarray=Math.max (maxarray,currentarray);

        }
        return maxarray;
    }
}