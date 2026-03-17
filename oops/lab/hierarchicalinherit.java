class A{
     public void print(){
        System.out.println("class a method");
     }
}
class B extends A{
    public void printb(){
        System.out.println("class b method ");
    }
}
class C extends A {
    public void printC(){
        System.out.println("class c method");
    }
} 
public class hierarchicalinherit {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.print();
        obj1.print();

        }
    }

