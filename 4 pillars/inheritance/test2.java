package inheritance;
class grandparent {
private String name;
private int age;
public grandparent(int age,String name){
    this.age=age;
    this.name = name;
    System.out.println("gp constor called");
}
public void setname(String name){
    this.name = name;
}
public String getname(){
    return name;
}
public void setage(int age){
    this.age = age;
}
public int getage(){
    return age;
}
}
class parent extends grandparent {
    public parent(int age,String name){
        super(age, name);
        System.out.println("parent construtor called");
    }
    public void parentmethod(){
        System.out.println("parent");
    }
}
class child extends parent {
    public child(int age, String name){
        super(age,name);
        System.out.println("child constr. caleed");
    }
    public void childmethod(){
        super.parentmethod();
        System.out.println("child method claled");
    }
}
public class test2 {
    public static void main(String[] args) {
        child a = new child(85,"shruti");
        // parent parent1 = new parent();
        // child1.setname("shruti");
        // parent1.setname("sanjay");
        // System.out.println(child1.getname());
    }
}

