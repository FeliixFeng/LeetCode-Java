package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 171] 训练计划 V
 */
public class PLCR171_LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof {

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        while(curA != curB){
            if(curA == null){
                curA = headB;
            }else{
                curA = curA.next;
            }

            if(curB == null){
                curB = headA;
            }else{
                curB = curB.next;
            }
        }

        return curA;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR171_LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof outer = new PLCR171_LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}