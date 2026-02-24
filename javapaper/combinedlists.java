import java.util.*;
public class combinedlists {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // List<String> list1 = new ArrayList<>();
        // List<String> list2 = new ArrayList<>();
        // String [] arr1 = sc.nextLine().split(" ");
        // String [] arr2 = sc.nextLine().split(" ");
        // List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        // List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        // // System.out.println(list1);
        // // System.out.println(list2)
        // HashMap<String,Integer> h1 = new HashMap<>();
        // HashMap<String,Integer> h2 = new HashMap<>();
        // for(String s : list1){
        //     if(h1.containsKey(s)){
        //         h1.put(s,h1.get(s)+1);
        //     }else{
        //         h1.put(s,1);
        //     }
        // }  
        // for(String s : list2){
        //     if(h2.containsKey(s)){
        //         h2.put(s,h2.get(s)+1);
        //     }else{
        //         h2.put(s,1);
        //     }
        // }
        // // for(String s : list2){
        // //     h2.put(s,h2.getOrDefault(s,0)+1);
        // // }

        // //COMBINED FREQUENCY MAP
        // HashMap<String ,Integer> combined = new HashMap<>();
        // combined.putAll(h1);

        // for(String s : h2.keySet()){
        //     if(combined.containsKey(s)){
        //         combined.put(s,combined.get(s)+h2.get(s));
        //     }else{
        //         combined.put(s,h2.get(s));
        //     }
        // }
        // //COMNON ELEMENTS MAP
        // HashMap<String ,Integer> common = new HashMap<>();
        // for(String key : h1.keySet()){
        //     if(h2.containsKey(key)){
        //         int mincount = Math.min(h1.get(key), h2.get(key));
        //         common.put(key,mincount);
        //     }
        // }

        // //exclusive element from list1
        // HashMap<String,Integer> exclusive = new HashMap<>();
        // for(String key : h1.keySet()){
        //     if(!h2.containsKey(key)){
        //         exclusive.put(key,h1.get(key));
        //     }
        // }
        // System.out.println("combined frequncy mao "+combined);
        // System.out.println("rdc"+common);
        // System.out.println("ubu"+exclusive);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] a1 = a.split(" ");
        String[] a2 = b.split(" ");
        List<String> l1 = new ArrayList<>(Arrays.asList(a1));
        List<String> l2 = new ArrayList<>(Arrays.asList(a2));
        HashMap <String , Integer> h1 = new HashMap<>();
        HashMap <String , Integer> h2 = new HashMap<>();
        for(String s : l1){
                h1.put(s,h1.getOrDefault(s,0)+1);
        }
        for(String s :l2){
                h2.put(s,h2.getOrDefault(s,0)+1);
        }
        //combine 
        HashMap<String , Integer> combine = new HashMap<>(h1);
        for(String s : h2.keySet()){
            if(combine.containsKey(s)){
                combine.put(s,combine.get(s)+h2.get(s));
            }else{
                combine.put(s,h2.get(s));
            }
        }
        HashMap<String , Integer> common = new HashMap<>();
        for(String s : h1.keySet()){
            if(h2.containsKey(s)){
                int mincount = Math.min(h2.get(s),h1.get(s));
                common.put(s,mincount);
            }
        }
        HashMap<String,Integer> exclu = new HashMap<>();
        for(String s: h1.keySet()){
            if(!h2.containsKey(s)){
                exclu.put(s,h1.get(s));
            }
        }
        System.out.println("combine: " + combine.keySet());
        System.out.println("common: " + common.keySet());
        System.out.println("exclu: " + exclu.keySet());
         System.out.println("combine: " + combine);
        System.out.println("common: " + common);
        System.out.println("exclu: " + exclu.keySet());
    }
}
