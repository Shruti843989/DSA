import java.util.*;
import java.util.function.BiConsumer;
public class biconsumer {
    /*This interface has one function accept(), this function takes two input values for performing 
some operations and does not return any value.   */
    public static void main(String[] args) {
          // This function takes two input value and does not return any value  
        BiConsumer<Integer, Integer> sum = (Integer num1, Integer num2) -> { 
     System.out.println("um of two number are ="+(num1+num2));  };
   //accept function to get the result  
         sum.accept(30,40); 
    
}
}