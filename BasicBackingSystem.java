/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basicbackingsystem;
import java.util.Scanner;
public class BasicBackingSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double balance = 1000.0;
        int choice;
        
        while (true) {
        System.out.println("\n##= Basic Banking System Menu =##"
        + "\n 1. Deposit"+ "\n 2. Withdraw"+"\n 3. Check Balance"+"\n 4. Exit"
                +"\n-------------------"+ "\n Enter your Choice: ");
        choice = scan.nextInt();
        
        switch (choice){
            case 1:
                System.out.print("Enter the Deposit Amount: ");
                double DepositAmount = scan.nextDouble();
                
               if (DepositAmount > 0){
                  balance += DepositAmount;
                   System.out.print("Deposited: "+ DepositAmount);
                   System.out.print("\nNew Balance: "+ balance);    
               }
               else{
                   System.out.print("Please enter sufficient amount.");
               }
                   break;
                   
            case 2:
                System.out.print("Enter the Withdraw Amount: ");
                double WithdrawAmount = scan.nextDouble();
                
                if (WithdrawAmount > 0 && WithdrawAmount <= balance){
                    balance -= WithdrawAmount;
                    System.out.print("Withdrew " + WithdrawAmount);
                    System.out.print("New Balance: "+balance);
                }
                else if(WithdrawAmount > balance){
                    System.out.print("Insufficient balance.");
                }
                else {
                    System.out.print("Please enter sufficient amount.");
                }
                break;
            
            case 3:
                System.out.print("Your Balance is: " + balance);
                break;
    
            case 4:
                System.out.print("Thank you for using the Banking System. Come back again later!");
        
                scan.close();
                System.exit(0);
                break;
                
            default:
                System.out.print("Invalid choice. ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR!ERROR!");
                    break;
        
        }
            
            
        
        }
    }
}
