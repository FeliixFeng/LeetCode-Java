package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [2] 两数相加
 */
public class P2_AddTwoNumbers {

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 创建一个哑节点作为结果链表的开头
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0; // 进位

        while (p != null || q != null) {
            // 获取当前节点的值，如果节点为空则补 0
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = carry + x + y;
            carry = sum / 10; // 计算新的进位

            // 创建新节点存储个位数值
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // 移动指针
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // 最后如果还有进位，额外补充一个节点
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        P2_AddTwoNumbers outer = new P2_AddTwoNumbers();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}