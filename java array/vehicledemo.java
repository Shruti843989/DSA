import java.util.*;
abstract class VehicleTypeBase{
    public abstract void drive();
    public abstract void fueltype();
}
class Car extends VehicleTypeBase {
    public void drive(){
        System.out.println("");
    }
    public void fueltype(){
        System.out.println("");
    }
    public void playMusic(){
        System.out.println("");
    }
}
class bike extends VehicleTypeBase {
    public void drive(){
        System.out.println("");
    }
    public void fueltype(){
        System.out.println("");
    }
    public void doWheelie(){
        System.out.println("");
    }
}
class truck extends VehicleTypeBase {
    public void drive(){
        System.out.println();
    }
    public void fueltype(){
        System.out.println();
    }
    public void loadCargo(){
        System.out.println();
    }
}
public class vehicledemo {
    public static void main(String[] args) {
        
    }
}
