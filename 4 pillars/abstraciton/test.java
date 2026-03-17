package abstraciton;
abstract class  animal {
    public animal(){//obj ni create kr skte lkkin constructor create kr skte h abstract class ka

    }
    public abstract void sayhello();//for abstract abstrac class also needed
    public void sleep(){//all possible for normal methos in abstract class
        
    }
}
class dog extends animal {
    public void sayhello(){
        System.out.println("grdtrb");
    }
}
class cat extends animal {
    public void sayhello(){
        System.out.println("meow");
    }
}
public class test {//abstract class ka obj create nhi kr skte or class main normal method lih skte ho
    public static void main(String[] args) {
        animal ob = new dog();//refernce de dskte hian qki obj subclass ka create hora h

    }
}
