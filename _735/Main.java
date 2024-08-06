package _735;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//735. 小行星碰撞
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<asteroids.length;){
            if(stack.size()==0 || asteroids[i]>0 || stack.peek()<0 && asteroids[i]<0){
                stack.push(asteroids[i]);
                i++;
            }else{
                int peek = stack.peek();
                int s = peek + asteroids[i];
                if(s<0){
                    stack.pop();
                }else if(s==0){
                    stack.pop();
                    i++;
                }else{
                    i++;
                }
            }
        }
        List<Integer> list= new ArrayList<>(stack);
        int[] ans = stack.stream().mapToInt(Integer::intValue).toArray();

        return ans;
    }
}
public class Main {
}
