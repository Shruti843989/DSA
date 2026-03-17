import java.util.*;
class employe {
    private String name;
    private double salary;
    public employe(String name , double salary){
        this.name = name;
        this.salary= salary;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
    }
}
public class salary {
    public static void main(String[] args) {
        employe employe1 = new employe("shruti", 7484516);
        System.out.println(employe1.getname()+" salary is "+employe1.getsalary());
    }
}
