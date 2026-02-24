import java.util.*;
public class wordfreqimpques {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    sentence = sentence.toLowerCase().replaceAll ("[^a-z]","");
    String[] word= sentence.split("\\s+");
    TreeMap<String,Integer> map = new TreeMap<>();
    for(String w: word){
        map.put(w,map.getOrDefault(w,0)+1);
    }
    // for(String s : map.keySet()){
    //     System.out.println(s+" = "+map.get(s));
    // }
    map.forEach((s,count) -> System.out.println(s +": "+count));
 }   
}
