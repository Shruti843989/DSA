

public class finalkeyword {
    final String name = "manu";
    int age = 27;
    public static void main(String[] args) {
        finalkeyword std1 = new finalkeyword();
        //error if we change this name into main function then it will genrate error like std.name="shruti";and then print std.1name then generte error 
        
        System.out.println(std1.name);
        System.out.println(std1.age);
        
    }
}
