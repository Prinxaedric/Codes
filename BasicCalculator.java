/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basiccalculator;
import java.util.Scanner;
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        char Operators;
        double Num1,Num2,Result;
        
        System.out.print("Enter the First Number: ");
        Num1 = scan.nextDouble();
        
        System.out.println("Choose an operator: +, -, *, or /");
        Operators = scan.next().charAt(0);
        
        System.out.print("Enter the Second Number: ");
        Num2 = scan.nextDouble();
        
        switch (Operators){
            case'+':
            Result = Num1 + Num2;
                System.out.print(Num1 + " + "+ Num2+ " = "+ Result);
                break;
            
            case'-':
            Result = Num1 - Num2;
                System.out.print(Num1 + " - "+ Num2+" = "+ Result);
                break;
        
        
            case'*':
            Result = Num1 * Num2;
                System.out.print(Num1+ " * "+ Num2+ " = "+ Result);
                break;
        
        
            case'/':
                Result = Num1 / Num2;
                System.out.print(Num1+ " / "+ Num2+ " = "+ Result);
                break;
        
        default:
        System.out.print("Invalid Operator");
        break;      
        }
            
    }
}
