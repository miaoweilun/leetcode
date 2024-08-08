package _933;
// mwl 933. 最近的请求次数

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        while(!queue.isEmpty()){
            if(queue.peek()<t-3000)
                queue.poll();
            else
                break;
        }
        queue.add(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

public class Main {
}
