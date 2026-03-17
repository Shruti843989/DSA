public class oops1 {
    //functionallity of students
    String name;
    int age;
    //function written in class called method
    public void printdata(){
         System.out.println(name);
         System.out.println(age);
    }
    public static void main(String[] args) {
        oops1 std1=new oops1();
        std1.name="shruti";
        std1.age=15;
        std1.printdata();

        oops1 std2=new oops1();
        std2.name="shyam";
        std2.age=22;
        std2.printdata();
    }
    
}
