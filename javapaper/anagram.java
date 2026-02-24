import java.util.*;
public class anagram {
    public static boolean isanagram(String a, String b){
        if(a.length() != b.length()) return false;
        HashMap<Character,Integer> mp1 = new HashMap<>();
        for(int i=0;i<a.length();i++){
            Character ch = a.charAt(i);
            if(mp1.containsKey(ch)){
                mp1.put(ch,mp1.getOrDefault(ch,0)+1);
            }
        }
        
        HashMap<Character,Integer> mp2 = new HashMap<>();
        for(int i=0;i<b.length();i++){
            Character ch =b.charAt(i);
            // if(!mp2.containsKey(ch)){
            //     mp2.put(ch,1);
            // }else{
            // int currfreq = mp2.get(ch);
            // mp2.put(ch,currfreq+1);
            if(mp2.containsKey(ch)){
                mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            }
        }
        
        return mp1.equals(mp2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // HashMap<Character, Integer> mp1 = new HashMap<>();
        boolean d = isanagram(a.toLowerCase(),b.toLowerCase());
        System.out.println(d);
    }
}
