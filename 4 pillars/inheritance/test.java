package inheritance;

 class animal {
    // public class Animal {
    private String name;
    private int age;
    public void setname(String name ){
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
    public void sayhello(){
        System.out.println("");
    }
}
    class dog extends animal {
        String breed;
    
    public void eat(){
        System.out.println("this animal eats food");
    }
    }
    public class test {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.setname("shivam");
        System.out.println("hivo");
        System.out.println(dog1.getname());
    }
  }  // 
