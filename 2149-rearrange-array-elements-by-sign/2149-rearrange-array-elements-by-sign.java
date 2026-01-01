class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int n=nums.length;
        int[] ans=new int[n];
        int positiveindex=0;
        int negativeindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[positiveindex]=nums[i];
                positiveindex=positiveindex+2;
            }
else{
    ans[negativeindex]=nums[i];
    negativeindex=negativeindex+2;

}


        }
        return ans;


    }
}
    
