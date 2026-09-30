class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int[] stack = new int[n];
        int top = -1;

        int third = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true;

            while (top >= 0 && stack[top] < nums[i]) {
                third = stack[top--];
            }

            stack[++top] = nums[i];
        }
        return false;
    }
}
