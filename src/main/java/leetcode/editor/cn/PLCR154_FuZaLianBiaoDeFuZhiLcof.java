package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
/**
 * [LCR 154] 复杂链表的复制
 */
public class PLCR154_FuZaLianBiaoDeFuZhiLcof {

//leetcode submit region begin(Prohibit modification and deletion)



class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // first foreach, establish mapping
        Node cur = head;
        while(cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        // next, random
        cur = head;

        while(cur != null){
            Node newNode = map.get(cur);

            if(cur.next != null){
                newNode.next = map.get(cur.next);
            }
            if(cur.random != null){
                newNode.random = map.get(cur.random);
            }
            cur = cur.next;
        }


        return map.get(head);
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR154_FuZaLianBiaoDeFuZhiLcof outer = new PLCR154_FuZaLianBiaoDeFuZhiLcof();
        Solution solution = outer.new Solution();
        
        System.out.println("本地测试已就绪");
    }
}