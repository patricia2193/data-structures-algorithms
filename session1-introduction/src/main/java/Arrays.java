public class Arrays {

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

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 5};
        int[] anotherArray = {1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicate(anotherArray));

        System.out.println(numIdenticalPairs(array));
        System.out.println(numIdenticalPairs(anotherArray));
    }
}
