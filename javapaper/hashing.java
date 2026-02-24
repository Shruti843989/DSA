import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> h1 = new HashMap<>();
         //adding number
        h1.put("akash ", 21);
        h1.put("efr" , 21);
        h1.put("efeg", 21);
        System.out.println(h1.get("akash"));
        System.out.println(h1.get("rgrre"));
        //cahnging/updating
        h1.put("akash",85);//21-85
        System.out.println(h1.get("akash"));//85
        //removing 
        System.out.println(h1.remove("akash"));//85
        System.out.println(h1.remove("dgrug"));//null
        // chcking if a key is in the hashmap
        System.out.println(h1.containsKey("akash"));//false
        System.out.println(h1.containsKey("efr"));//true
        //adding a new enity if the new key doesnt exist already
        h1.putIfAbsent("akash",30);//will enter
        h1.putIfAbsent("rthd",85);//will enter
        //get all keys int he hashmap
        System.out.println(h1.keySet());//[yuiy,yyguiy,yuygu]
        System.out.println(h1.values()); 
        System.out.println(h1.entrySet());
        //traversing
        for(String key : h1.keySet()){
            System.out.printf("age of %s is %d\n",key,h1.get(key));
        }
        //another way
        System.out.println();;
        for(Map.Entry<String , Integer> e : h1.entrySet()){
            System.out.printf("age of %s is &d",e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : h1.entrySet()){
            System.out.println(e.getKey() + e.getValue());
        }
    }
}