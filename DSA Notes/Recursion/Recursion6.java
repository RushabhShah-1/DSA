// Find first and last occurence of an element in string
public class Recursion6 {
    public static int first=-1;
    public static int last=-1;
    public static void main(String[] args) {
        String s="abcadab";
        checkOccurence(s, 0, 'a');
    }
    public static void checkOccurence(String s,int idx,char element){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=s.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        checkOccurence(s, idx+1, element);
    }
}

