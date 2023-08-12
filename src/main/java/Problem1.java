import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem1 {

    public List isNotOnTheList(List<Integer> nums) {
        //complexity time 2n = 2n because we are using 2 fors for the each time that the array pass then
        // 2n = n because 2 it is constant
        //complexity space
        // n because depending of the content of the array is how many values we are storing.
        boolean[] found = new boolean[nums.size() + 1];

        // Step 1: Mark found numbers
        for (int num : nums) {
            if(num>=found.length) continue;
            found[num] = true;
        }

        // Step 2: Find missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i < found.length; i++) {
            if (!found[i]) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;

    }
}
