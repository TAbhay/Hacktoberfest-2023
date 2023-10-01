import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String,Integer> map=new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        // //Search
        // if(map.containsKey("Indonesia")){
        //     System.out.println("Present");
        // }else{
        //     System.out.println("Absent");
        // }
        // System.out.println(map.get("China"));//key exists
        // System.out.println(map.get("Indonesia"));//key doesn't exist
        // //Iterator(1)
        // for(Map.Entry<String, Integer> e:map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // //Iterator(2)
        // Set<String> keys=map.keySet();
        // for(String key:keys){
        //     System.out.println(key+" "+map.get(key));
        // }
        //Remove
        map.remove("China");
        System.out.println(map);
    }
}
