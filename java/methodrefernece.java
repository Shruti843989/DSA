import java.util.*;
class name {
    String name;
    name(String name){
        this.name=name;
    }
}
public class methodrefernece {
    // use method withput invoing and in place of lambda expression
    public static void main(String[] args) {
        List<String> list=Arrays.asList("apple","banana","mango","orange");
        //foreach sain print karynge qki yai consumer interface ka kaam hai
        list.forEach(x -> System.out.println(x)); //lambda expression
        list.forEach(System.out::println); //method reference
        //Constructor reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(x -> new name(x)).toList();//lambda expression
        // method reference
        names.stream().map(name::new).toList();
    }
}
