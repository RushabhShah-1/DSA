public class Array{
    int index;
    int A[];
    Array(int length){
        A=new int[length];
        index=0;
    }
    public int getIndex(){
        return this.index;
    }
    public void insert(int a){
        if(index==A.length){
            int B[]=new int[(int)(A.length*1.5)+1];
            this.index=0;
            for(;index<A.length;index++){
                B[index]=A[index];
            }
            A=B;
            B=null;
        }
        A[index++]=a;
    }
    public void insertAt(int pos,int num){
        for(int i=index;i>=pos;i--){
            A[i+1]=A[i];
        }
        A[pos]=num;
    }
    public void remove(int deleteIndex){
        if(deleteIndex < 0 || deleteIndex>index){
            throw new IllegalArgumentException();
        }
        for(int i=deleteIndex;i<index;++i){
            A[i]=A[i+1];
        }
        index--;
    }
    public void intAt(int intAtIndex){
        System.out.println("Integer at index "+intAtIndex+": "+A[intAtIndex]);
    }
    public void indexOf(int n){
        for(int i=0;i<=index;i++){
            if(A[i]==n){
                System.out.println(n+" is found at index "+i);
                return;
            }
        }
        System.out.println(n +" is not found in array.");
    }
    public void max(){
        int max=Integer.MIN_VALUE;
        for(int n:A){
            if(n>max){
                max=n;
            }
        }
        System.out.println("Maximum element in the array is "+max);
    }
    public void intersect(int B[]){
        Array commonElements=new Array(3);
        for(int i=0;i<=index;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    commonElements.insert(A[i]);
                    break;
                }
            }
        }
        System.out.print("Common elements ");
        commonElements.print();
    }
    public void reverse(){
        int reverse[]=new int[index+1];
        for(int i=index-1,j=0;i>=0;i--,j++){
            reverse[j]=A[i];
        }
        A=reverse;
        reverse=null;
    }
    public void print(){
        System.out.println("Array is ");
        for(int i=0;i<index;i++){
            System.out.println(A[i]);
        }
    }
    
}