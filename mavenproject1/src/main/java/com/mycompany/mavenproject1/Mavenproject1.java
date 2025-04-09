package com.mycompany.mavenproject1;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        double grossMonthlySalary = 24000.0;
        
        double phoneAllowance = 500; 
        double clothingAllowance = 500; 
        double riceSubsidy = 1500; 
        
      
        double SSS = 250; 
        double Philhealth = grossMonthlySalary * 0.05; 
        double tax = grossMonthlySalary * 0.15; 
        double Pagibig = grossMonthlySalary * 0.02; 

    
        double totalAllowance = phoneAllowance + clothingAllowance + riceSubsidy;
        

        double totalDeductions = SSS + Philhealth + tax + Pagibig;

 
        double weeklyGrossSalary = grossMonthlySalary / 4;
        double weeklyPhoneAllowance = phoneAllowance / 4;
        double weeklyClothingAllowance = clothingAllowance / 4;
        double weeklyRiceSubsidy = riceSubsidy / 4;
        
   
        double weeklySSS = SSS / 4;
        double weeklyPhilhealth = Philhealth / 4;
        double weeklyTax = tax / 4;
        double weeklyPagibig = Pagibig / 4;

   
        double weeklyTotalAllowance = weeklyPhoneAllowance + weeklyClothingAllowance + weeklyRiceSubsidy;
        
       
        double weeklyTotalDeductions = weeklySSS + weeklyPhilhealth + weeklyTax + weeklyPagibig;

    
        double weeklyNetSalary = weeklyGrossSalary + weeklyTotalAllowance - weeklyTotalDeductions;
        
    
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String datenow = sdf.format(new Date());
        LocalTime time = LocalTime.now();
        
        String emp_name = "Leila, Martinez";
        int emp_id = 10014;

        System.out.println("\nEmployee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Gross Monthly Salary: " + grossMonthlySalary);
        System.out.println("Phone Allowance (Monthly): " + phoneAllowance);
        System.out.println("Clothing Allowance (Monthly): " + clothingAllowance);
        System.out.println("Rice Subsidy (Monthly): " + riceSubsidy);
        
        System.out.println("\n--- Weekly Breakdown ---");
        System.out.println("Gross Weekly Salary: " + weeklyGrossSalary);
        System.out.println("Phone Allowance (Weekly): " + weeklyPhoneAllowance);
        System.out.println("Clothing Allowance (Weekly): " + weeklyClothingAllowance);
        System.out.println("Rice Subsidy (Weekly): " + weeklyRiceSubsidy);
        System.out.println("Weekly Total Allowance: " + weeklyTotalAllowance);
        
        System.out.println("\n--- Weekly Deductions ---");
        System.out.println("SSS (Weekly): " + weeklySSS);
        System.out.println("Philhealth (Weekly): " + weeklyPhilhealth);
        System.out.println("Tax (Weekly): " + weeklyTax);
        System.out.println("Pag-ibig (Weekly): " + weeklyPagibig);
        System.out.println("Total Weekly Deductions: " + weeklyTotalDeductions);
        
        System.out.println("\nNet Weekly Salary: " + weeklyNetSalary);
        System.out.println("Date: " + datenow + " Time: " + time);
    }
}
