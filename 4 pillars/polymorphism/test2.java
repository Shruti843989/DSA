package polymorphism;
class animal {//runtime polu.or overridding
    
    public void sayhello(){
        System.out.println("animal hrllo");
    }
}
class cat extends animal{
    @Override
    public void sayhello(){
        System.out.println("animal mewo");
    }
}
class dog extends animal{
    @Override
    public void sayhello(){
        System.out.println("animal aerg");
    }
    public void  saybye(){
        System.out.println("bye");
    }
}
public class test2 {
    public static void main(String[] args) {
        animal animal = new animal();
        animal dog = new dog();//upcasting
        dog.sayhello();//animal aerg
       dog mydog = (dog)dog;
       //not possible to print say bye thriugh animal class
    //    animal dog2 = new dog();
    //         dog2.saybye();//error
    }
}
