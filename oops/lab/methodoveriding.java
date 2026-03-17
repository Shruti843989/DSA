class bank{
    public void rateofInterest(){
    System.err.println("Generally rate of interest is 5%");
    }
}
class SBI extends bank{
    public void rateofInterest(){
        System.err.println("7%");
    }
}
class pnb extends bank{
    public void rateofInterest(){
        System.out.println("10%");
    }
}
public class methodoveriding {
    public static void main(String[] args) {
        pnb pnb1 = new pnb();
        pnb1.rateofInterest();
        SBI sbi1 = new SBI();
        sbi1.rateofInterest();
    }
}
