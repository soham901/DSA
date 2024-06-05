import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 10, 1 };
        int[] expected = { 3, 4, 6, 16, 17 };
        int[] ans = new Solution().runningSum(nums);

        if (ans.length != expected.length) {
            System.out.println("Wrong answer");
            return;
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != expected[i]) {
                System.out.println("Wrong answer");
                System.out.println("Input: " + Arrays.toString(nums));
                System.out.println("Expected: " + Arrays.toString(expected));
                System.out.println("Output: " + Arrays.toString(ans));
                return;
            }
        }

        System.out.println("Accepted");
    }
}
