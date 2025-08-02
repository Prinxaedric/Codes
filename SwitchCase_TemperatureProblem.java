/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase_temperatureproblem;
import java.util.Scanner;
public class SwitchCase_TemperatureProblem {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       int Temperature, Temp, Outcome;
       
       System.out.print("Press ( 1 ) for Celcius to Fahrenheit and  Press ( 2 ) for Fahrenheit to Celcius."+
               "\nChoose a temperature Conversion: 1 or 2? ");  
       Temperature = scan.nextInt();
       
       System.out.print("Enter the Temperature: ");
       Temp = scan.nextInt();
       
      
       
        switch (Temperature){
            
            case 1:
             Outcome = (Temp * 9/5) + 32;
                System.out.print("The result in Farentheit will be: " + Outcome);
                break;
            
            case 2:
                Outcome = (Temp - 32) * 5/9;
                System.out.print("The result in Celcuis will be: " + Outcome+" \nNote: These are not 100% accurate. This program can't read the outcome with decimals");
               
                break;
                
            default:
                System.out.print("Invalid Input.");
                break;
        }
        
    }
}
