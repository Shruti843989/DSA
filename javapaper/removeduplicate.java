import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<a;i++){
                list.add(sc.nextInt());
            }
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> unique = new ArrayList<>(set);
        System.out.println(unique);
    }
}
