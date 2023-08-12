import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    Problem1 problem = new Problem1();

    @Test
    public void returnEmtyList() {
        List<Integer> nums = List.of();
        Assertions.assertEquals(problem.isNotOnTheList(nums),List.of());

    }

    @Test
    public void givenOrdersNumbersReturnEmtyList() {
        List<Integer> nums = List.of(1,2,3);
        Assertions.assertEquals(problem.isNotOnTheList(nums),List.of());
    }


    @Test
    public void givenTwoNumberReturnMissingOneInRange() {
        List<Integer> nums = List.of(1,3);
        Assertions.assertEquals(problem.isNotOnTheList(nums),List.of(2));
    }

    @Test
    public void givenTwoDisorderNumberReturnMissingOneInRange() {
        List<Integer> nums = List.of(3,1);
        Assertions.assertEquals(List.of(2),problem.isNotOnTheList(nums));
    }

    @Test
    public void givenTwoIdenticalNumberReturnMissingOneInRange() {
        List<Integer> nums = List.of(1,1);
        Assertions.assertEquals(List.of(2),problem.isNotOnTheList(nums));
    }


    @Test
    public void givenDuplicatedNumberFollowNextOneShouldReturnMissingNumberInRange() {
        List<Integer> nums = List.of(1,1,2);
        Assertions.assertEquals(List.of(3),problem.isNotOnTheList(nums));
    }

    @Test
    public void givenDuplicatedNumberFollowByGreaterNumberShouldReturnMissingNumberInRange() {
        List<Integer> nums = List.of(1,1,3);
        Assertions.assertEquals(List.of(2),problem.isNotOnTheList(nums));
    }

    @Test
    public void FullExersice() {
        List<Integer> nums = List.of(4,3,2,7,8,2,3,1);
        Assertions.assertEquals(List.of(5,6),problem.isNotOnTheList(nums));
    }
}