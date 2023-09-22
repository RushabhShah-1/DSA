//Print all subsequences of given string.
// Eg1 s="abc" subsequences=["","a","b","c","ab","bc","ac"."abc"]
// Eg2 s="aaa" subsequences=["","a","a","a","aa","aa","aaa"]
// Extends question: print all unique subsequences of given string.
// Eg1 s="aaa" subsequences=["","a","aa","aaa"]
import java.util.HashSet;

public class Recursion7 {
    public static void main(String[] args) {
        String s="bcd";
        HashSet<String> hs=new HashSet<>();// hashset for unique subsequences
        printSubsequences(s, 0, "",hs);
        
        System.out.println(hs);
    }
    public static void printSubsequences(String str,int idx,String newStr,HashSet<String> hs){
        if(idx==str.length()){
            hs.add(newStr);
            // System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        printSubsequences(str, idx+1,newStr+currChar,hs);
        printSubsequences(str, idx+1, newStr,hs);
    }
}
