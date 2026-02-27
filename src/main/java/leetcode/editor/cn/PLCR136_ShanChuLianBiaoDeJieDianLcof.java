package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 136] 删除链表的节点
 */
public class PLCR136_ShanChuLianBiaoDeJieDianLcof {

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
    public ListNode deleteNode(ListNode head, int val) {

        // 1. special situation: if the head need to delete
        if(head != null && head.val == val){
            return head.next;
        }

        // 2. init double pointer
        ListNode pre = head;
        ListNode cur = head.next;

        // 3. traverse list, find the target or go to the final
        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }

        // 4. if find the target, skip it
        if(cur != null){
            pre.next = cur.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR136_ShanChuLianBiaoDeJieDianLcof outer = new PLCR136_ShanChuLianBiaoDeJieDianLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}