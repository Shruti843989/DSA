import java.util.*;
public class subset {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    TreeSet<Integer> set1 = new TreeSet<>();
    TreeSet<Integer> set2 = new TreeSet<>();

    while(true){
        String input = sc.next();1
        if(input.equalsIgnoreCase("done")) break;
        set1.add(Integer.parseInt(input));
    }

    while(true){
        String input= sc.next();
        if(input.equalsIgnoreCase("done")) break;
        set2.add(Integer.parseInt(input));
    }
    //## very important this is not possible
    // String a = sc.nextLine();
    // String b = sc.nextLine();
    // String [] st1 = a.split(" ");
    // String [] st2 = b.split(" ");
    // for(int i=0;i<st1.length;i++){
    //     set1.add(Integer.parseInt(st1[i]));
    // }
    // for(int i=0;i<st2.length;i++){
    //     set2.add(Integer.parseInt(st2[i]));
    // }

     
    
    if(set2.containsAll(set1)){
        System.out.println(set1 + "is a subset of" + set2);
    }else{
        System.out.println(set1 +"is not a subset of " + set2);
    }

    }
  }

