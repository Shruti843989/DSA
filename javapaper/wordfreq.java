import java.util.*;
public class wordfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] arr = a.split(" ");
        HashMap<String,Integer> h2 = new HashMap<>();
        TreeMap<String,Integer> h1 = new TreeMap<>();
        for(String s : arr){
            h1.put(s,h1.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry : h1.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
        for(String s : arr){
            h2.put(s,h2.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry : h2.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }
}
