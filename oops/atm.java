import java.util.*;
public class atm {
    int pin=5674;
    int bal=546;
     public void checkpin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PIN");
       int n = sc.nextInt();
       if(n==pin){
        menu();
       }
       else{
        System.out.println("Enter a valid pin");
        checkpin();
       }
     }
     public void checkbalance(){
        System.out.println("balance"+bal);
        menu();
     }
     public void withdrawn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawn amount.");
        int amount = sc.nextInt();

       if (amount > bal){
        System.out.println("inSufficant balance");
        withdrawn();
       }
       else{
        bal=bal-amount;
        System.out.println("Money withrawn succesfully.");
        menu();
       }
     }
     public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter depoist Money ");
        int depositmoney = sc.nextInt();
        bal=bal+depositmoney;
        System.out.println("money deposit successfully");
     }
     public void menu(){
        System.out.println("Enter your option");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdrawn ");
        System.out.println("3.Depoist");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option");
        int op=sc.nextInt();
        switch(op) {
            case 1:
                checkbalance();
                break;
            case 2:
                withdrawn();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default: 
                System.out.println("Enter a valid option: ");
        }
     }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    atm obj = new atm();
    obj.checkpin();


}
    
}
