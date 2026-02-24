import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<a;i++){
            a1.add(sc.nextInt());
        }
        int max = a1.get(0);
            for(int c : a1){
                if(c>max){
                    max=c;
                }
            }
            System.out.println("max: " + max);
    }
}
