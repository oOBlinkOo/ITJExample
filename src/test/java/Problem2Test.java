import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Problem2Test {

    Problem2 problem= new Problem2();
    @Test
    public void testValidSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        int[] result = problem.findIndexForTarget(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 10;
        int[] expected = {};

        int[] result = problem.findIndexForTarget(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 5;
        int[] expected = {};

        int[] result = problem.findIndexForTarget(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-2, -7, 11, 15};
        int target = 9;
        int[] expected = {0, 2};

        int[] result = problem.findIndexForTarget(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }
}