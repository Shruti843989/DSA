import java.util.*;
public class lastoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        String taget = sc.nextLine();
        int index = 1;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(taget)){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.err.println(index);
        }
    }
}
