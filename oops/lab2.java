import java.util.*;
public class lab2 {
    public static int count(int n){
    int i=0;
    int count=0;
    while(i!=n){
        if(i%2!=0){
            count++;
        }
        i++;
    }
    return count;
}
public static void display(int n){
    int i=0;
    while(i!=n){
        if(i%2!=0){
           System.out.print(i+" ");
        }
        i++;
    }   
}
public static int sum(int n){
    int i=0;
    int sum =0;
    while(i!=n){
        if(i%2!=0){
            sum+=i;
        }
        i++;
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(n);
        System.out.println();
        System.out.println("the total no is "+count(n));
        int totalsum = sum(n);
        System.out.println("the total sum is "+totalsum);
    }
}

    

