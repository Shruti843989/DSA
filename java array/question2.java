// write a java program to check if two string are anagrams using hashmap 
import java.util.*;
public class question2 {
    public static boolean areanagrams(String a , String b){
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character,Integer> ana= new HashMap<>();
        // Count chars from first string
        for (char c : str1.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
}

// Subtract counts using second string
for (char c : str2.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) - 1);
}

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
    }
}
