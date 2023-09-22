import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 140);
        map.put("China", 130);
        map.put("US", 30);
        map.put("China", 125);
        System.out.println(map);
        if(map.containsKey("China")){
            System.out.println("Key exist in the map");
        }else{
            System.out.println("Key does not exist in the map");
        }
        System.out.println("China "+map.get("China"));
        System.out.println("Singapore "+map.get("Singapore"));
        System.out.println("Printing hashmap using Map.Entry");
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("Printing hashmap using Set");
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }   
}
