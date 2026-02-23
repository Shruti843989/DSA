import java.util.*;
import java.util.function.Consumer;
public class consumer {
    public static void main(String[] args) {
        // Consumer interface is used to perform an action on the given input without returning any result.
        // It has a single abstract method called accept() that takes one argument and returns void.
        // yai kuch dega nhi bss lega 
        // iska abstract method accept hoga
        Consumer<Integer> c = x -> System.out.println(x);
        c.accept(10); // Output: 10
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        list.forEach(c); // Output: 10 20 30 40 50
        //forEach loop me bss consumer hi use hoga
        //isse hum log list ke sare elements ko print karwa sakte hai
        //kaise ? “List ke har element ko Consumer ke accept() method ko bhejna” yai forEach loop ka kaam hoga
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");  
        Consumer<String> printName = name -> System.out.println("Name: " + name);  
        names.forEach(printName);
        
    }
}
