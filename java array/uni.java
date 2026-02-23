// // you are given two list write a java program that uses linkhashset to perform a follinh 
// // union of the alll elements of both list 
// // intersection of both list 
// // difference elements in list 1 that are not in list 2
// import java.util.*;
// public class uni{

//     public static void main(String[] args) {
//         LinkedHashSet<Integer> List1 = new LinkedHashSet<>();
//         LinkedHashSet<Integer> List2 = new LinkedHashSet<>();
//         List1.add(1);
//         List1.add(2);
//         List1.add(3);
//         List1.add(4);
//         List2.add(4);
//         List2.add(5);
//         List2.add(6);
//         List2.add(2);
//         LinkedHashSet<Integer> union = new LinkedHashSet<>();
//         union.addAll(List1);
//         union.addAll(List2);
//         System.out.println("union" + union );
//     }
// }
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for list1
        System.out.print("Enter number of elements in list1: ");
        int n1 = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter elements of list1:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        // Input for list2
        System.out.print("Enter number of elements in list2: ");
        int n2 = sc.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter elements of list2:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        // Convert lists to LinkedHashSet
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(list1);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list2);

        // Union
        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference
        LinkedHashSet<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (list1 - list2): " + difference);

        sc.close();
    }
}

