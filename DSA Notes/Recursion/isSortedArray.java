// Check array is sorted or not(Strictly increasing)
public class isSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Array Sorted: "+isSorted(a, 0, 1));
    }
    public static boolean isSorted(int arr[],int previdx,int curridx){
        if(curridx==arr.length){
            return true;
        }
        int prev=arr[previdx];
        if(prev<arr[curridx]){
            return isSorted(arr, curridx, curridx+1);
        }
        else return false;
    }
}
