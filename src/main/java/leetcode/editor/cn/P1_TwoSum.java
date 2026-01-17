package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

/**
 * [1] 两数之和
 */
public class P1_TwoSum {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // 使用 HashMap 存储已经遍历过的数字及其索引，实现 O(n) 的查找效率
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // 检查差值是否已经在 map 中
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }

                // 将当前数字存入 map。注意：这里发生了自动装箱 (Autoboxing)
                // int 会被包装成 Integer 对象存储
                map.put(nums[i], i);
            }

            // 如果没有找到（根据题目要求，这种情况通常不会发生）
            return new int[0];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new P1_TwoSum().new Solution();
        // 手动本地调试
        System.out.println("本地测试已就绪");
    }
}