import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem2 {
    public int[] findIndexForTarget(int[] nums,Integer target) {
        //complexity Time is n because we go thourh all the array length
        //complexity space is n because it can store the hole array
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array or throw an exception
        return new int[0];

    }
}
