package leetcode.editor.cn;

public class TwoSum {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            // 左右指针
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                // 根据 sum 和 target 的比较，移动左右指针
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else if (sum == target) {
                    return new int[]{left, right};
                }
            }
            return new int[]{};
        }


    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        // put your test code here
        int[] arr = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}