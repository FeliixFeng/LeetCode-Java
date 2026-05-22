package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 142] 训练计划 IV
 */
public class PLCR142_HeBingLiangGePaiXuDeLianBiaoLcof {

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
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        if(l1 == null && l2 == null){
            return null;
        }
        while(l1!= null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }

        if(l1 != null){
            cur.next = l1;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR142_HeBingLiangGePaiXuDeLianBiaoLcof outer = new PLCR142_HeBingLiangGePaiXuDeLianBiaoLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}