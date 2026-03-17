class animal{
    animal(){//constructor
System.out.println("animal");
    }
    String color="brown";
    void eat(){
        System.out.println("eat");
    }
}
class dogs extends animal{
    dogs(){
        super();//call animal constructor ,print animal 
        System.out.println("dog is created");
    }
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();
    }
    String color="black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class superkeyord {
   public static void main(String[] args) {
    dogs dog1=new dogs();
    dog1.printcolor();
    dog1.work(); 
   } 
}
