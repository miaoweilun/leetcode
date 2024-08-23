package _399;

import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // 1. 构造图
        Map<String, Map<String, Double>> map = new HashMap<>();
        int index=0;
        double[] ans = new double[queries.size()];
        for(List<String> equation : equations){
            String from = equation.get(0), to = equation.get(1);
            if(map.containsKey(from)){
                Map<String, Double> m = map.get(from);
                m.put(to, values[index]);
            }else{
                Map<String, Double> m = new HashMap<>();
                m.put(to, values[index]);
                map.put(from, m);
            }

            if(map.containsKey(to)){
                Map<String, Double> m = map.get(to);
                m.put(from, 1/values[index]);
            }else{
                Map<String, Double> m = new HashMap<>();
                m.put(from, 1/values[index]);
                map.put(to, m);
            }
            index++;
        }

        // for(Map.Entry<String, Map<String, Double>> enrty: map.entrySet()){
        //     System.out.println(enrty.getKey() + "================================");
        //     for(Map.Entry<String, Double> e : enrty.getValue().entrySet()){
        //          System.out.println(e.getKey() + " : " + e.getValue());
        //     }
        // }

        index=0;
        for(List<String> query : queries){
            String from = query.get(0), to = query.get(1);
            // System.out.println(from + " : " + to);
            if(!map.containsKey(from) || !map.containsKey(to)){
                // System.out.println("NO!!!!!!!!");
                ans[index] = -1.0;
            }else if(from.equals(to)){
                ans[index] = 1.0;
            }else{
                Set<String> visited = new HashSet<>();
                double a = dfs(map, from, to, visited);
                ans[index] = a==0.? -1.0 : a;
            }
            // System.out.println(ans[index]);
            index++;
        }

        return ans;

    }

    public double dfs(Map<String, Map<String, Double>> map, String from, String to, Set<String> visited){
        for(Map.Entry<String, Double> entry : map.get(from).entrySet()){
            String s = entry.getKey();
            if(visited.contains(s))
                continue;
            if(s.equals(to)){
                return entry.getValue();
            }
            visited.add(s);
            double count = entry.getValue() * dfs(map, s, to, visited);
            if(count!=0)
                return count;
            else{
                visited.remove(s);
            }
        }

        return 0;
    }

}


public class Main {
}
