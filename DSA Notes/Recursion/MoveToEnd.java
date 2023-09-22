// Move all x to end of the string.
public class MoveToEnd {
    public static int count=0;
    public static String ns="";
    public static void main(String[] args) {
        String s="axbcdxexfx";
        // moveXToEnd(s, 0, 'x', 0, "");
        String s1=moveXToEndIterative(s, 'x');
        System.out.println(s1);
    }
    public static void moveXToEnd(String s,int idx,char toMove,int count,String newstr){
        if(idx==s.length()){
            for(int i=0;i<count;i++){
                newstr+=toMove;
            }
            System.out.println(newstr);
            return;
        } 
        char currChar=s.charAt(idx);
        if(currChar==toMove){
            count++;
            moveXToEnd(s, idx+1, toMove, count,newstr);
        }
        else{
            newstr+=currChar;
            moveXToEnd(s, idx+1, toMove, count, newstr);
        }
    }
    public static String moveXToEndIterative(String str,char moveLast){
        int count=0;
        String newStr="";
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr==moveLast) count++;
            else newStr+=curr;
        }
        for(int i=1;i<=count;i++){
            newStr+=moveLast;
        }
        return newStr;
    }
}
