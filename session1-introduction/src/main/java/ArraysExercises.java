import java.util.*;
import java.util.stream.Collectors;

public class ArraysExercises {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] selectNums = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    selectNums = new int[]{i, j};
                }
            }
        }
        return selectNums;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap();

        for (int number: nums) {
            map.put(number, !map.getOrDefault(number, false));
        }

        for (Map.Entry<Integer, Boolean> entry: map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> numbers = Arrays.stream(nums).boxed().toList();
        List<Integer> results = new ArrayList<>();
        for (Integer number : numbers) {
            results.add((int) Math.pow(number, 2));
        }
        results.sort(Comparator.naturalOrder());
        return results.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 5};
        int[] anotherArray = {1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicate(anotherArray));

        System.out.println(numIdenticalPairs(array));
        System.out.println(numIdenticalPairs(anotherArray));

        int[] array2 = {2, 2, 1};
        System.out.println(singleNumber(array2));

        int[] toSquareRoot = {-7,-3,2,3,11};
        int[] answer = sortedSquares(toSquareRoot);
        for (int answe : answer) {
            System.out.println(answe);
        }
    }
}
