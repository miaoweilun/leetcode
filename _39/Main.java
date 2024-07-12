package _39;

/*
* mwl 39. 组合总和
* */

import java.util.*;

class Solution {

    private List<List<Integer>> ans;

    public void add(int[] candidates, int target, int index, int sum, List<Integer> list){

        // for(int num:list){
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        for(int i=index; i<candidates.length; i++){
            if(sum+candidates[i]==target){
                list.add(candidates[i]);
                ans.add(list);
            }
            else if(sum+candidates[i] < target){
                List<Integer> newList = new ArrayList<>(list);
                newList.add(candidates[i]);
                add(candidates, target, i, sum+candidates[i], newList);
            }else{
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        ans = new ArrayList<>();

        int i=0;
        for(int num : candidates){
            if(num==target){
                List<Integer> list = new ArrayList<>();
                list.add(num);
                ans.add(list);
            }
            else if(num < target){
                List<Integer> list = new ArrayList<>();
                list.add(num);
                add(candidates, target, i, num, list);
            }
            i++;
        }

        return ans;
    }
}

public class Main {
}
