import java.util.*;
import java.util.Stack;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Stack<Character> str = new Stack<>();
        for(char c :word.toCharArray()){
            str.push(c);
        }
        
        String rev = " ";
        while(!str.empty()){
            rev+=str.pop();
        }

        System.out.println(word);
        System.out.println(rev);
        if(word.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
