package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 175] 计算二叉树的深度
 */
public class PLCR175_ErChaShuDeShenDuLcof {

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int calculateDepth(TreeNode root) {
        //dfs
        if(root == null){
            return 0;
        }

        return Math.max(calculateDepth(root.left), calculateDepth(root.right))+ 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR175_ErChaShuDeShenDuLcof outer = new PLCR175_ErChaShuDeShenDuLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}