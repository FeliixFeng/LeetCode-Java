package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 140] 训练计划 II
 */
public class PLCR140_LianBiaoZhongDaoShuDiKgeJieDianLcof {

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
    public ListNode trainingPlan(ListNode head, int cnt) {
        // define the double pointer
        ListNode cur = head;
        ListNode ans = head;

        // let cur go cnt step
        while(cnt != 0){
            if(cur == null)
                return null;
            cur = cur.next;
            cnt --;
        }

        // let cur and ans go togeter
        while(cur != null){
            cur = cur.next;
            ans = ans.next;
        }

        // when the cur get the final node, ans get the answer
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR140_LianBiaoZhongDaoShuDiKgeJieDianLcof outer = new PLCR140_LianBiaoZhongDaoShuDiKgeJieDianLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}