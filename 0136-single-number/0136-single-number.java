class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        for(int i=0;i<nums.length;i++){
value=value^nums[i];          //xor if same then zero else 1

        }
        return value;
    }
}