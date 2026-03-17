
    public class bankaccount {
        private long accountnumber;
        private double balance;
         public void deposit(int amount){
            if(amount >0){
                balance+=amount;
                System.out.println("Deposited "+ amount);
            }else{
                System.out.println("invalid amount");
            }
         }
         public void withdraw(int amount){
            if(amount >0 && amount <= balance){
                balance-=amount;
                System.out.println("withdraw"+amount);
            }else{
                System.out.println("invalid");
            }
         }
         public double getbalance(){
            return balance;
         }
         public void setbalance(int balance){
            this.balance=balance;
         }
         public void setaccountnumber(long accountnumber){
            this.accountnumber=accountnumber;
         }
         public long getaccountnumber(){
            return accountnumber;
         }
    

    public static void main(String[] args) {
        bankaccount customer = new bankaccount();
        customer.setaccountnumber(85485485);
        customer.withdraw(5264);
        customer.deposit(5849);
        customer.withdraw(100);
        System.out.println(customer.getbalance());
    }
 }