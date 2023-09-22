//Subarray sum equal to k

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> subarrays=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ArrayList<Integer> currarray=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    currarray.add(arr[k]);
                }
                subarrays.add(currarray);
            }
        }
        int count=0;
        for(ArrayList<Integer> array:subarrays){
            int sum=0;
            for(int x:array){
                sum+=x;
            }
            if(sum==3){
                System.out.println(array);
                count++;
            }
        }
        System.out.println(count);
    }
}
