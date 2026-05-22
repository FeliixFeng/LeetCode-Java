package leetcode.editor.cn; 

import java.util.*;
import leetcode.editor.common.*;

/**
 * [LCR 125] 图书整理 II
 */
public class PLCR125_YongLiangGeZhanShiXianDuiLieLcof {

//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public CQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void appendTail(int value) {
        stackIn.push(value);
    }
    
    public int deleteHead() {
        // if stackOut not null, pop directly
        if(!stackOut.empty()){
            return stackOut.pop();
        }

        if(stackIn.empty()){
            return -1;
        }

        while(!stackIn.empty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        // 实例化外部类以调用内部类 Solution
        PLCR125_YongLiangGeZhanShiXianDuiLieLcof outer = new PLCR125_YongLiangGeZhanShiXianDuiLieLcof();

        
        System.out.println("本地测试已就绪");
    }
}