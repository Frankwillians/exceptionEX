package Application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class progamEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            System.out.print("Enter ammount for withdraw: ");
            double withdraw = sc.nextDouble();
            Account ac = new Account(number,holder,balance,withdrawLimit);
            
            ac.withdraw(withdraw);

            System.out.println("balance = "+ ac.getBalance());
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
