class students {
    String name;
    int age;
        
    public void printInfo(){
        System.out.println(this.name);//##
        System.out.println(this.age);
    }
    //constructor
    //non parameterized cons.
    students(){
        System.out.println("Constructor called");
    } 
    //parameterized 
    students(String name, int n){
        this.name= name;
        this.age=n;
    }
    // copy cons
    //used to declare and initialize and object 
    //from another object 
    //assign properties of s2 into s3
    students(students s3){
        this.name=s3.name;
        this.age=s3.age;

    }
} 



public class impconstructor {
    public static void main(String[] args) {
        students std1 = new students();
        std1.name="shradha";
        std1.age=27;
        std1.printInfo();

        students std2 = new students("shruti",85);
        std2.printInfo();//##

        students std3 = new students(std2);
        std3.printInfo();
        

    }
}
