
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                int index1 = map.get(required);
                int index2 = i;

                // return indices in increasing order
                if (index1 < index2)
                    return new int[]{index1, index2};
                else
                    return new int[]{index2, index1};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
