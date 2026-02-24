import java.util.*;
public class isomorphic {
    public static boolean isomorphic(String a , String b){
        HashMap<Character,Character> mp = new HashMap<>();
        // for(int i=0;i<a.length();i++){
        //     char sh = a.charAt(i);
        //     char th = b.charAt(i);
        //     if(mp.containsKey(sh)){
        //         if(mp.get(sh)!=th) return false;
        //     }else if(mp.containsValue(th)){//agr value phale sian hi map hua hain kisi or value ko 
        //         return false;
        //     }
        //     else{
        //         mp.put(sh,th);
        //     }
        // }
        // return true;
        HashMap<Character,Character> h1 = new HashMap<>();
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            char sh = a.charAt(i);
            char th = b.charAt(i);
            if(h1.containsKey(sh)){
                if(h1.get(sh)!=th) return false;
            }else if(h1.containsValue(th)) return false;
            else{
                h1.put(sh,th);
            }
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String a = sc.next();
         String b = sc.next();
        boolean t = isomorphic(a, b);
        System.out.println(t);
    }
}
