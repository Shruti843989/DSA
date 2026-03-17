abstract class Payment {
    double amount;
    String transactionId;
    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }
     void generateslip(){
        System.out.println("Receiptno: " + transactionId + " for amount " + amount);
    }
}
interface Refundable {
    void refund(double amount);
}
interface confirmed {
    void confirmed();
    void ticketgeneration();

}
class cancel extends Payment implements Refundable{
    cancel(double amount, String transactionId) {
        super(amount, transactionId);
    }
      public void refund(double refund) {
        System.out.println("Refund of " + refund + " initiated for Transaction: " + transactionId);
    }
}
class book extends Payment implements confirmed{
     book(double amount, String transactionId) {
        super(amount, transactionId);
    }
    @Override
    public void confirmed() {
        System.out.println("Ticket is COnfirmed");
    }
    public void ticketgeneration(){
        System.out.println("booked and confirm");
    }
}
public class test {
    public static void main(String[] args) {
        cancel cab=new cancel(300,"CAB101");
         cancel train=new cancel(1000,"CAB101");
        book bus = new book(200,"BUSc201");
         cab.generateslip();
            cab.refund(300); 
            train.generateslip();
            train.refund(1000);

    }
}
   