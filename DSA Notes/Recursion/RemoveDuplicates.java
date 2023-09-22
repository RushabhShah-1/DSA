public class RemoveDuplicates {
    static boolean map[]=new boolean[26];
    public static void main(String[] args) {
        String str="abbdccdba";
        // removeDuplicateIterative(str);
        System.out.println(removeDuplicatesRec(str, 0, ""));
    }
    public static String removeDuplicatesRec(String s,int idx,String unique){
        if(idx==s.length()) return unique;
        char currChar=s.charAt(idx);
        if(map[currChar-'a']){
            return removeDuplicatesRec(s, idx+1, unique);
        }
        else{
            unique+=currChar;
            map[currChar-'a']=true;
            return removeDuplicatesRec(s, idx+1, unique);
        }
    }
    public static void removeDuplicateIterative(String str){
        String unique="";
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            if(map[currChar-'a']){
                continue;
            }
            else{
                unique+=currChar;
                map[currChar-'a']=true;
            }
        }
        System.out.println(unique);
    }
    public static boolean isUniqueChar(char c,String unique){
        for(int i=0;i<unique.length();i++){
            char currChar=unique.charAt(i);
            if(currChar==c){
                return false;
            }
        }
        return true;
    }
}
