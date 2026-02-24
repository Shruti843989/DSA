import java.util.*;;
public class union {
    public static void printSet(HashSet<Integer> union ) {
        for (Integer num : union) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        HashSet<Integer> List1 = new HashSet<>();
        HashSet<Integer> List2 = new HashSet<>();
        for(int i=0;i<n1;i++){
            List1.add(sc.nextInt());
        }

        for(int i=0;i<n2;i++){
            List2.add(sc.nextInt());
        }
        HashSet<Integer> union = new HashSet<>(List1);
            union.addAll(List2);
            System.out.println("Union: ");
            printSet(union);
    
        HashSet<Integer> intersection = new HashSet<>(List1);
        intersection.retainAll(List2);
        System.out.println("Intersection: ");
        printSet(intersection);

        HashSet<Integer> differ = new HashSet<>(List1);
        differ.removeAll(List2);
        System.out.println("Difference: ");
        printSet(differ);
         ArrayList<Integer> unique = new ArrayList<>(union); 
         //used to convert anything which I want the answer in[   ]
         System.out.println(unique);

}
}
