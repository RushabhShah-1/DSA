import java.util.HashMap;
import java.util.HashSet;
public class Q4 {
    public static void findStartAndEnd(HashMap<String,String> itineraries){
        String start="",end="";
        HashSet<String> from=new HashSet<>();
        HashSet<String> to=new HashSet<>();
        for(String key:itineraries.keySet()){
            from.add(key);
            to.add(itineraries.get(key));
        }
        for(String x:from){
            if(!to.contains(x)) {
                start=x;
                break;
            }
        }
        for(String x:to){
            if(!from.contains(x)) {
                end=x;
                break;
            }
        }
        System.out.println("Starting:"+start+"\nDestination:"+end);
        System.out.print("Itinery: "+start);
        while(itineraries.containsKey(start)){
            System.out.print(" -> "+itineraries.get(start));
            start=itineraries.get(start);
        }
    }
    public static void main(String[] args) {
        HashMap<String,String>  itineraries=new HashMap<>();
        itineraries.put("B","C");
        itineraries.put("E","F");
        itineraries.put("C","D");
        itineraries.put("A","B");
        itineraries.put("D","E");

        findStartAndEnd(itineraries);
    }
}
