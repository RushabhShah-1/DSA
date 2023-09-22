public class RevString {
    public static void main(String[] args) {
        String s=reverse(0, "Hello");
        System.out.println(s);
    }
    public static String reverse(int idx,String s){
        if(idx==s.length()){
            return ""; 
        }
        char currChar=s.charAt(idx);
        String rev=reverse(idx+1,s);
        return rev+currChar;
    }
}
