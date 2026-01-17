class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> sc =new HashSet<>();
        for(int num:nums)sc.add(num);
        int maxstreak=0;
        for(int num : sc){
            if(!sc.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(sc.contains(currNum+1)){
                    currStreak++;
                    currNum++;

                }
                maxstreak= Math.max(maxstreak,currStreak);

            }

            
        
        }
        return maxstreak;

    }
}