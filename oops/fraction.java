
public class fraction {
    public static fract multiply(fract f1 , fract f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        fract f4 = new fract(numerator , denominator);
        return f4;
    }
    public static fract fractionsadd( fract f1 , fract f2){
      int numerator=  f1.num*f2.den + f1.den*f2.num;
      int denominator = f1.den*f2.den;
      fract f3 = new fract(numerator, denominator);
      return f3;
    }
    public static int gcd(int num,int den){
        int min  = Math.min(num,den);
        for(int i =min;i>=1;i--){
            if(num%i==0 && den%i==0) return i; 
        }
        return min;
    }
public static class fract{
    int num;
    int den;
    //constructor
public fract(int num,int den){
    this.num=num;
    this.den=den;
    // yai hum anser jb hume simplify chaiye toh isse yha call kr skte h
    // simplify();
}  
//num or den ko dono ko uske hcf sian divide krdo simplified fraction mil jayega

public void simplify(){
// if(num<den){
//     if(den%num==0 ){
//         den=den/num;
//         num=1;  
//     }
// }
    int hcf = gcd(num,den);
    den=den/hcf;
    num=num/hcf; 
}
}
public static void main(String[] args) {
fract f1 = new fract(35,21);
System.out.println(f1.num+"/"+f1.den);
f1.simplify();
System.out.println(f1.num+"/"+f1.den);
fract f2 = new fract(7,21);
//addition ke bad ek new fraction main store ho 
fract f3 = fractionsadd(f1,f2);
System.out.println(f3.num+ "/"+f3.den);
fract f4 = multiply(f1, f2);
System.out.println(f1.num+"/"+f1.num);

}
}
