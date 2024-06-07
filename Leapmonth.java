/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.years;

/**
 *
 * @author DAVID'S-PC
 */
public class Leapmonth {

    public static void main(String[] args) {
        // Test the leap month logic with a given year and month
        int year = 2023;  // Example year
        int month = 2;    // Example month (February)

        boolean isLeapMonth = isLeapMonth(year, month);
        
        if (isLeapMonth) {
            System.out.println("The month " + month + " of year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " of year " + year + " is not a leap month.");
        }
    }

    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
}