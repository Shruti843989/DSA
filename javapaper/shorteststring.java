import java.util.*;
public class shorteststring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr1 = s.split(" ");
        List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        HashSet<String> set = new HashSet<>(list1);
        //for shortest 
        PriorityQueue<String> small = new PriorityQueue<>(
            (a,b) -> a.length()==b.length()?a.compareTo(b):a.length()-b.length()
        );
        small.addAll(set);
        System.out.println("Shortest: "+small.peek());
        //for largest
        PriorityQueue<String> big = new PriorityQueue<>(
            (a,b) -> a.length()==b.length()?b.compareTo(a):b.length()-a.length()
        );
        big.addAll(set);
        System.out.println("longest: "+big.peek());

        //top 4 largest 
        System.out.println("top 3 elemt: ");
        for(int i=0;i<3 && !small.isEmpty();i++){
            System.out.println(small.poll()+" ");
        }
    }
}
