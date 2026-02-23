import java.util.*;
public class jacaDemo {
    public static void main(String[] args) {
        //Streams
        // java 9 --> minimal code, fucntional programming
        // java 9 --> lambda expression, streams, fate and time api 

        //Predicate --> functioanl interface (Boolean valued fucntion )
        // LAmbda expression --> implementation of method of functional interfaceit si anonymous fucntion 
        Thread t1 =new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("Child Thread");
            }
        });
        MathOperation addition = (a, b) -> a + b;//(int a,int b) -> { return a+b;}
        MathOperation subtraction = (a ,b) -> a-b;
        int res = addition.operation(1,20);
        System.out.println(res);
        // hum interface ka refernce use krre hain lambda expression use krne ke liye 
        // hum ek fucniton k0 treat krre hain assa a variable = fucntional variable 
    }
}
        @FunctionalInterface
        interface MathOperation {
            int operation(int a, int b);//abstract method
        }
        // hum iss interface ko implement krte phir mehtod likhte additon or subtraction ka
        // isse toh yai lambada expression use kr liya 
        
    

