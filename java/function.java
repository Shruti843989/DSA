import java.util.*;
import java.util.function.Function;
public class function {
    //fucntion kcuch kaam krega kuch lega or kuch return bhi krega
    // iska abstract method apply hoga
    //

    public static void main(String[] args) {
        Funciton<Integer, Integer> f = x -> x * x;
        System.out.println(f.apply(5));//25
        Funciton<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Hello"));//5
        Funciton<Integer, String> f2 = x -> "Number is: " + x;
        System.out.println(f2.apply(10));//Number is 10
        Function<Integer, Integer> f3 = x -> x*2;
        Function<Integer, Integer> f4 = x -> x*3;
        Function<Integer, Integer> f5 = f3.andThen(f4);// phle f3 phir f4
        System.out.println(f5.apply(5));// first 5*2=10 then 10*3=30
        Function<Integer, Integer> f6 = f3.compose(f4); //phle f4 phir f3
        System.out.println(f6.apply(5));// first 5*3=15 then 15*2=30
        Function<Integer, Integer> f7 = Function.identity();
        System.out.println(f7.apply(10));//10 same yai result aa jeeyga
    }
}
