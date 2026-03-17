package polymorphism;
class  calculator {//complile tym poly.//overloading
    public int add(int a,int b){
        return a+b;
    }
    public int abs(int a, int b,int c){
        return a+b+c;
    }
    public double abc(double a, double b){
        return a+b;
    }
}
public class test {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(8,5));
    }
}
