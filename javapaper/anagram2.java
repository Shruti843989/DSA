import java.util.*;
public class anagram2 {
    public static boolean anagram(String a, String b){
        if(a.length()!=b.length()) return false;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
public  static void main(String [] args){
Scanner sc = new Scanner(System.in);
String a = sc.next();
String b = sc.next();
boolean result = anagram(a,b);
System.out.println(result);

 }   
}
