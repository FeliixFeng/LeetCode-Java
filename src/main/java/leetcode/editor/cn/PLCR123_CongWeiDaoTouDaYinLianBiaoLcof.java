package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 123] 图书整理 I
 */
public class PLCR123_CongWeiDaoTouDaYinLianBiaoLcof {

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
    public int[] reverseBookList(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode cur = head;

        while(cur != null){
            s.push(cur.val);
            cur= cur.next;
        }

        int [] result = new int[s.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = s.pop();
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR123_CongWeiDaoTouDaYinLianBiaoLcof outer = new PLCR123_CongWeiDaoTouDaYinLianBiaoLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}