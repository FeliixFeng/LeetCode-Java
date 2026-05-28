package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 144] 翻转二叉树
 */
public class PLCR144_ErChaShuDeJingXiangLcof {

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
    public TreeNode flipTree(TreeNode root) {
        // if get null
        if(root == null){
            return null;
        }

        // reverse left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // foreach left and right
        flipTree(root.left);
        flipTree(root.right);

        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR144_ErChaShuDeJingXiangLcof outer = new PLCR144_ErChaShuDeJingXiangLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}