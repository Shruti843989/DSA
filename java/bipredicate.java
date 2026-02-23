import java.util.*;
import java.util.function.BiPredicate;
public class bipredicate {
    //bipredicate take two input arguments and return boolean value after performing some operations.
    public static void main(String[] args) {
        BiPredicate<Integer, Integer>bp=(num1,num2)->(num1+num2)%2==0;
        System.out.println("is the sum of two number is even ="+bp.test(10,20));
    }
}
