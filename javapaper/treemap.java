import java.util.*;
public class treemap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String,Integer> t1 = new TreeMap<>();
        for(int i=0;i<n;i++){
            String category = sc.next();
            int score = sc.nextInt();
            t1.put(category,t1.getOrDefault(category,0)+score);
        }
        for(Map.Entry<String,Integer> entry : t1.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        for(String s : t1.keySet()){
            System.out.println(s+" "+t1.get(s));
        }
    }
}
