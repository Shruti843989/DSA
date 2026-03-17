
public class polymorphism {
public static void main(String[] args) {
    System.out.println("a");
    polymorphism cc = new polymorphism();
    cc.n1();

}
public static void main() {
    System.out.println("B");
}
void n1(){
    System.out.println("B");//ek name ke multiple methos bnna skta h 
}  
void n1(int a , String b){
    System.out.println("B");
}
}
