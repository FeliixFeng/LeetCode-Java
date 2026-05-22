package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 141] 训练计划 III
 */
public class PLCR141_FanZhuanLianBiaoLcof {

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode trainningPlan(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode cur = head;
        ListNode pre = null;
        ListNode next = head.next;

        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }


        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR141_FanZhuanLianBiaoLcof outer = new PLCR141_FanZhuanLianBiaoLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}