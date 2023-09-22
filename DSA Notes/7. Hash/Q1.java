/*
Given an integer array of size n, find all elements that appear more than [ n/3 | times.
nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1);
Output: 1
nums[] = {1, 2};
Output: 1,2
*/

import java.util.HashMap;
import java.util.Map;

public class Q1{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1, 3, 2, 5, 1, 3, 1, 5, 1};
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>(arr.length/3)) System.out.println(e.getKey());
        }
    }
}
