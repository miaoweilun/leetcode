package _209;

// mwl

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int begin=0, end=0, count=nums[0], ans=0;

        while(end<nums.length){
            if(count >= target){
                if(ans==0 || end-begin+1 < ans)
                    ans = end-begin+1;
                if(count == target){
                    if(end+1<nums.length)
                        count+=nums[++end];
                    else
                        break;
                }else{

                    count-=nums[begin++];
                }
            }
            else{
                if(end+1<nums.length)
                    count+=nums[++end];
                else
                    break;
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("答案：" + new Solution().minSubArrayLen(4, new int[]{1, 4, 4}));
    }
}
