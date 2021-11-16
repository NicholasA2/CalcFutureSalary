/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfuturesalary;
import java.util.Scanner;

/**
 *
 * @author Nicholas Adiohos
 */
public class CalcFutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your initial salary: $");
        double initialSalary = input.nextInt();
        System.out.print("Please enter the amount of years you have been working: ");
        double years = input.nextInt();
        
        //Use loops to find out how much the salary increases each time
        double finalSalary = 0;
        if (years<3)
            {finalSalary = initialSalary * Math.pow(1.03, years); }
        else if (years>=3 && years<10)
            {finalSalary = initialSalary * Math.pow(1.03, 2) * Math.pow(1.05, years - 2); }
        else
            {finalSalary = initialSalary * Math.pow(1.03, 2) * Math.pow(1.05, 7) * Math.pow(1.08, years - 9);}
    System.out.printf("Your salary is now: %.2f" , finalSalary);
    }
}
    
    

