import java.util.*;
public class question4pdf {
    public static TreeSet<String> removeduplicateandsortreverse(List<String> l){
        return new TreeSet<>(Comparator.reverseOrder()){{
            addAll(l);
        }};
    }
    public static TreeSet<String>  removedupliateadsort(List<String> l){
        return new TreeSet<>(l);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        List<String> l = Arrays.asList(arr);
        TreeSet<String> sortedSet = removedupliateadsort(l);
        TreeSet<String> reversesortedset = removeduplicateandsortreverse(l);
        System.out.println("sorted"+ sortedSet);
        System.out.println("Sorted descendong: "+ reversesortedset);


    }
}
//banana apple orange banana apple
//sorted[apple, banana, orange]
//Sorted descendong: [orange, banana, apple]
