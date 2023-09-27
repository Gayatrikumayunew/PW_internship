package java_bank_application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gayatri
 */
public class Console_Based_Java_Banking_System {

    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("                                || Welcome to  Banking Application ||");
         System.out.println("=====================================================");
   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and ID");
        String name=sc.next();
        String id =sc.next();
         
        for(int i=0;i<30;i++){
            System.out.print("**"+" ");
        }
        System.out.println();
        BankMethods m=new BankMethods(name,id);
        m.showoption();
        for(int i=0;i<10;i++){
            System.out.print("*"+" ");
        }
        
        System.out.print("Thanks for using my application");
        for(int i=0;i<10;i++){
            System.out.print("*"+" ");
        }
        
    }
    
}
class BankMethods{
    int balance;
    int pretransaction;
    String name ;
    String id;
    
    BankMethods(String name,String id){
        this.name=name;
        this.id=id;
        
        
    }
    
    void deposite(int amount){
        if(amount!=0){
            balance =balance+amount;
            pretransaction =amount;
        }
    }
     void withdraw(int amount){
        if(amount!=0){
            balance =balance-amount;
            pretransaction = -amount;
        }
    }
     void getpretransaction(){
         if(pretransaction >0){
             System.out.println("Deposited amount" + pretransaction);
         }
         else if(pretransaction <0){
             System.out.println("Withdraw:" + Math.abs(pretransaction));
         }
         else {
             System.out.println("No transaction found");
         }
         
     }
     
     void showoption(){
         char option ='\0';
         Scanner sc =new Scanner(System.in);
         System.out.print("                                       Welcome :  " +name +"    ||"+"      Your ID:    " +id);
         System.out.println();
         for(int i=0;i<30;i++){
            System.out.print("**"+" ");
        }
       
         System.out.println();
         
         System.out.println();
         System.out.println("1.Check Balance"+"\n"+"2.Deposite"+"\n"+"3.Withdraw"+"\n"+"4.Previous Transaction Detail"+"\n"+"5.Exit"+"\n" );     do{
            System.out.println("----------------------------------------");
             System.out.println("|  Enter Any of the above option  |");
               System.out.println("----------------------------------------");
             option=sc.next().charAt(0);
             switch(option){
                 case '1':
                     System.out.println("Balance Rs."+balance);
                     break;
             
                 case '2':
                     System.out.println("Enter amount to deposite");
                     int amt=sc.nextInt();
                     deposite(amt);
                     break;
                 case '3':
                     System.out.println("Enter amount to withdraw");
                     int wrt=sc.nextInt();
                     withdraw(wrt);
                 case '4':
                     getpretransaction();
                 case '5':
                     break;
                     
                 default:
                     System.out.println("Invalid operation");
                     break;
                     
                     
                 }
          
         }
            while(option != '5');
         
     }
}
