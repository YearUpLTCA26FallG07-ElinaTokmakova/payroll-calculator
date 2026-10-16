package com.pluralsight;

import java.util.Scanner;

//Create a Java application named payroll-calculator that prompts the user to enter:
//− their name
//− their hours worked (a floating point number)
//− their pay rate (a floating point number)
//Calculate their gross pay.
//Display the employee's name and their gross pay.

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = myScanner.next();

        System.out.print("Enter hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = myScanner.nextDouble();

        double grossPay;

        if(hoursWorked > 40) {
            grossPay = hoursWorked * hourlyPayRate * 1.5;
            System.out.print("The gross pay for " + employeeName + " is $" + grossPay);
        } else {
            grossPay= hoursWorked * hourlyPayRate;
            System.out.print("The gross pay for " + employeeName + " is $" + grossPay);
        }
    }
}