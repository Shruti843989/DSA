import java.util.*;
public class question5exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            double value = Double.parseDouble(input);
            System.out.println(value);
        }catch(Exception e) {
            System.out.println("Invalid input");
        }
    }
}
